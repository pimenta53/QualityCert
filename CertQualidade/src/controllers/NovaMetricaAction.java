package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

@WebServlet("/NovaMetricaAction")
public class NovaMetricaAction extends HttpServlet {
  private static final long serialVersionUID = 11L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    float pesoComentarios = 0, pesoLinhas = 0, pesoFuncoes = 0, pesoErros = 0, pesoTempo = 0, pesoCCMcCabe = 0, pesoHalstead = 0;

    int valid = 0, ava = -1;
    long idMetrica = 0;
    ResultSet result = null, resultC = null, resultVP = null, generatedKeys = null;

    try{
      pesoComentarios = Float.parseFloat(req.getParameter("pesoComent"));
      pesoLinhas = Float.parseFloat(req.getParameter("pesoLinhas"));
      pesoFuncoes = Float.parseFloat(req.getParameter("pesoFuncoes"));
      pesoErros = Float.parseFloat(req.getParameter("pesoErros"));
      pesoTempo = Float.parseFloat(req.getParameter("pesoTempo"));
      pesoCCMcCabe = Float.parseFloat(req.getParameter("pesoCCMcCabe"));
      pesoHalstead = Float.parseFloat(req.getParameter("pesoHalstead"));
      //if (pesoComentarios + pesoLinhas + pesoFuncoes + pesoErros + pesoTempo + pesoCCMcCabe + pesoHalstead != 0)
      	//throw new NumberFormatException();
    }
    catch (NumberFormatException e) {res.sendRedirect("error.jsp"); return;}

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "certQualidade";
    String driver = "com.mysql.jdbc.Driver";
    String username = "root";
    String userPassword = "root";
    String strQuery = null;

    try {
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url + dbName, username, userPassword);
      Statement st = (Statement) conn.createStatement();
      Statement stC = (Statement) conn.createStatement();
      Statement stA = (Statement) conn.createStatement();
      Statement stCP = (Statement) conn.createStatement();
      Statement stRep = (Statement) conn.createStatement();
      Statement stVP = (Statement) conn.createStatement();

      //Inserir a nova metrica
      strQuery = "INSERT INTO PesoMetricas (pesoComentarios,pesoLinhas,pesoFuncoes,pesoErros,pesoTempo,pesoCCMcCabe," +
            "pesoHalstead) VALUES (" + pesoComentarios + "," + pesoLinhas + "," + pesoFuncoes + "," + pesoErros +
            "," + pesoTempo + "," + pesoCCMcCabe + "," + pesoHalstead + ")";
      valid = st.executeUpdate(strQuery, Statement.RETURN_GENERATED_KEYS);
      if(valid == 0) throw new SQLException("Creating PesoMetricas failed, no rows affected.");
      generatedKeys = st.getGeneratedKeys();
          if (generatedKeys.next()) idMetrica = generatedKeys.getLong(1);
          else throw new SQLException("Creating PesoMetricas failed, no generated key obtained.");
      System.out.println("Query Executed Successfully (PesoMetricas) with the id " + idMetrica + "!");

      //Correr todos os ProgramaTigers e actualizar a avaliacao com as novas metricas
      strQuery = "SELECT id, avaliacao FROM ProgramaTigers";
      result = st.executeQuery(strQuery);
      System.out.println("Query Executed Successfully (ProgramaTigers)!");

      while(result.next()){
        int id = result.getInt(1);
        int ava_Antiga = result.getInt(2);

        //Ir buscar as caracteristicas de determinado programa
        resultC = stC.executeQuery("SELECT * FROM CaracProgramas WHERE programaTiger = " + id);
        System.out.println("Query Executed Successfully (CaracProgramas)!");

        if(resultC.next()){
          strQuery = "SELECT * FROM valorespadrao";
          resultVP = stVP.executeQuery(strQuery);
          System.out.println("Query Executed Successfully (valorespadrao)!");

          //Calcula a nova avaliacao
          ava = avaliacao(resultVP, resultC.getInt(2),pesoComentarios,resultC.getInt(3),pesoLinhas,resultC.getInt(4),pesoFuncoes,
              resultC.getInt(5),pesoErros,resultC.getInt(6),pesoTempo,resultC.getInt(7),pesoCCMcCabe,
              resultC.getInt(8),pesoHalstead);

          //Cria o nova linha na tabela CaracProgramasPesoMetricas
          stCP.executeUpdate("INSERT INTO CaracProgramaPesoMetrica VALUES (" + resultC.getInt(1) + "," + idMetrica + ")");
          System.out.println("Query Executed Successfully (CaracProgramaPesoMetricas)!");
        }

        //Vai verificar se o programaTiger estava no repositorio Bom e mete-o no Mau ou vice-versa
        if (ava_Antiga < 4 && ava >=4){
          valid = stRep.executeUpdate("DELETE FROM MauProgramas WHERE programaTiger = " + id);
          if(valid == 0) throw new SQLException("Deleting failed, no rows affected.");
          System.out.println("Query Executed Successfully! (Eliminar Linha)");

          //coloca no outro repositorio
          valid = stRep.executeUpdate("INSERT INTO BomProgramas VALUES (" + id + ")");
          if(valid == 0) throw new SQLException("Creating failed, no rows affected.");
          System.out.println("Query Executed Successfully! (Inserir Linha)");
        }
        else if (ava_Antiga >= 4 && ava < 4){
          valid = stRep.executeUpdate("DELETE FROM BomProgramas WHERE programaTiger = " + id);
          if(valid == 0) throw new SQLException("Deleting failed, no rows affected.");
          System.out.println("Query Executed Successfully! (Eliminar Linha)");

          //coloca no outro repositorio
          valid = stRep.executeUpdate("INSERT INTO MauProgramas VALUES (" + id + ")");
          if(valid == 0) throw new SQLException("Creating failed, no rows affected.");
          System.out.println("Query Executed Successfully! (Inserir Linha)");
        }

        //Vai actualizar o campo avaliacao
        stA.executeUpdate("UPDATE ProgramaTigers SET avaliacao = " + ava + " WHERE id = " + id);
        System.out.println("Query Executed Successfully (ProgramaTigers)!");
      }
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    res.sendRedirect("IndexarMetricas");
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }

  private int avaliacao(ResultSet result, int nComentarios, float pesoComent, int nLinhas, float pesoLinhas, int nFuncoes,
      float pesoFuncoes, int nErros, float pesoErros, int ms, float pesoTempo, int nCCMcCabe,
      float pesoCCMcCabe, int nHalstead, float pesoHalstead) throws SQLException {

    float nComentariosVP = 0, nLinhasVP = 0, nFuncoesVP = 0, nErrosVP = 0, nTempoVP = 0, nCCMcCabeVP = 0, nHalsteadVP = 0;
    while(result.next()){
      nComentariosVP = result.getFloat(1);
      nLinhasVP = result.getFloat(2);
      nFuncoesVP = result.getFloat(3);
      nErrosVP = result.getFloat(4);
      nTempoVP = result.getFloat(5);
      nCCMcCabeVP = result.getFloat(6);
      nHalsteadVP = result.getFloat(7);
    }

    //Comentarios
    int estrelasComentarios = 0;
    if (nComentarios > nComentariosVP + nFuncoes) estrelasComentarios = 5;
    else if ((nComentarios >= nComentariosVP - nFuncoes) && (nComentarios <= nComentariosVP + nFuncoes)) estrelasComentarios = 4;
    else if (nComentarios > nComentariosVP - nFuncoes * 2) estrelasComentarios = 3;
    else if (nComentarios > nComentariosVP - nFuncoes * 3) estrelasComentarios = 2;
    else estrelasComentarios = 1;

    //Linhas
    int estrelasLinhas = 0;
    if (nLinhas < nLinhasVP - nFuncoes) estrelasLinhas = 5;
    else if ((nLinhas <= nLinhasVP + nFuncoes) && (nLinhas >= nLinhasVP - nFuncoes)) estrelasLinhas = 4;
    else if (nLinhas < nLinhasVP + nFuncoes * 2) estrelasLinhas = 3;
    else if (nLinhas < nLinhasVP + nFuncoes * 4) estrelasLinhas = 2;
    else estrelasLinhas = 1;

    //Funcoes
    int estrelasFuncoes = 0;
    if (nFuncoes < nFuncoesVP + nLinhas / 45) estrelasFuncoes = 1;
    else if (nFuncoes < nFuncoesVP + nLinhas / 30) estrelasFuncoes = 2;
    else if (nFuncoes < nFuncoesVP + nLinhas / 20) estrelasFuncoes = 3;
    else if (nFuncoes < nFuncoesVP + nLinhas / 15) estrelasFuncoes = 4;
    else estrelasFuncoes = 5;

    //Erros
    int estrelasErros = 0;
    if (nErros == 0) estrelasErros = 5;
    else estrelasErros = 1;

    //Tempo
    int estrelasTempo = 0;
    if (ms < nTempoVP - nLinhas * 0.5) estrelasTempo = 5;
    else if ((ms >= nTempoVP - nLinhas * 0.5) && (ms <= nTempoVP + nLinhas * 0.5)) estrelasTempo = 4;
    else if (ms < nTempoVP + nLinhas) estrelasTempo = 3;
    else if (ms < nTempoVP + nLinhas * 1.5) estrelasTempo = 2;
    else estrelasTempo = 1;

    //CCMcCabe
    int estrelasCCMcCabe = 0;
    if (nCCMcCabe > nCCMcCabeVP + nFuncoes * 8) estrelasCCMcCabe = 1;
    else if (nCCMcCabe > nCCMcCabeVP + nFuncoes * 4) estrelasCCMcCabe = 2;
    else if (nCCMcCabe > nCCMcCabeVP + nFuncoes * 2) estrelasCCMcCabe = 3;
    else if (nCCMcCabe > nCCMcCabeVP) estrelasCCMcCabe = 4;
    else estrelasCCMcCabe = 5;

    //Halstead
    int estrelasHalstead = 0;
    if (nHalstead > nHalsteadVP + nFuncoes * 5) estrelasHalstead = 1;
    else if (nHalstead > nHalsteadVP + nFuncoes * 2.5) estrelasHalstead = 2;
    else if (nHalstead > nHalsteadVP + nFuncoes) estrelasHalstead = 3;
    else if (nHalstead > nHalsteadVP) estrelasHalstead = 4;
    else estrelasHalstead = 5;

    float resultado = 0;
    resultado = estrelasComentarios * pesoComent + estrelasLinhas * pesoLinhas + estrelasFuncoes * pesoFuncoes +
      estrelasErros * pesoErros + estrelasTempo * pesoTempo + estrelasCCMcCabe * pesoCCMcCabe +
      estrelasHalstead * pesoHalstead;
    return Math.round(resultado);
  }
}

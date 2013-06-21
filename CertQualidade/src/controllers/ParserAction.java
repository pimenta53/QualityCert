package controllers;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ValoresPadrao;
import parser.*;
import tom.library.sl.VisitFailure;

import com.mysql.jdbc.Statement;

@WebServlet("/ParserAction")
public class ParserAction extends HttpServlet {
  private static final long serialVersionUID = 2L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    boolean repBase = false;
    ResultSet result = null;
    long idFicheiro = 0;
    if (req.getAttribute("idFicheiroS") != null) idFicheiro = (Long) req.getAttribute("idFicheiroS");
    else if (req.getAttribute("idFicheiroRB") != null){
      idFicheiro = (Long) req.getAttribute("idFicheiroRB");
      repBase = true;
    }
    int valid = 0;
    long idCarac = 0, idMetrica = 0;
    ResultSet generatedKeys = null, metricas, ficheiro;
    float pesoComentarios = 0, pesoLinhas = 0, pesoFuncoes = 0, pesoErros = 0, pesoTempo = 0, pesoCCMcCabe = 0, pesoHalstead = 0;
    int nCCMcCabe = 0, nComentarios = 0, nErros = 0, nFuncoes = 0, nHalstead = 0, nLinhas = 0;
    int nOperadoresDistintos=0, nOperandosDistintos=0, nOperandos=0, nNodos=0, nArestas=0;

    Calendar cal = new GregorianCalendar();
    int ms = cal.get(Calendar.MILLISECOND);         // 0..999
    /*
    carac.setnCCMcCabe(nCCMcCabe);
    carac.setnComentarios(nComentarios);
    carac.setnErros(nErros);
    carac.setnFuncoes(nFuncoes);
    carac.setnHalstead(nHalstead);
    carac.setnLinhas(nLinhas);
    carac.setTempo(ms);
    carac.setProgramaTiger(idFicheiro);
    req.setAttribute("Carac", carac);
    */

    //Tudo relacionado com a base de dados

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

      //Inserido as caracteristicas do programa na base de dados
      Statement st = (Statement) conn.createStatement();

      strQuery = "SELECT p.nomeFicheiro, u.userName FROM ProgramaTigers p, Utilizadores u WHERE p.id="+ idFicheiro+" AND p.utilizador=u.id";
      ficheiro = st.executeQuery(strQuery);

      String f = null;
      String nomeU = null;
      while (ficheiro.next()) {
    	  f = ficheiro.getString(1);
    	  nomeU = ficheiro.getString(2);
      }

      String str = "C:\\Users\\RaFaeL\\workspace\\CertQualidade\\files\\"+ nomeU +"\\" + f;
      System.out.println(str);
      String aux[] = new String[9];
  	try {
  		aux = parser.Rec.lerFicheiro(str);
  	} catch (VisitFailure e1) {
  		e1.printStackTrace();
  		System.out.println(e1.toString());
  	}

  	nFuncoes = Integer.parseInt(aux[0]);
  	nOperadoresDistintos = Integer.parseInt(aux[1]);
  	nOperandosDistintos = Integer.parseInt(aux[2]);
  	nOperandos = Integer.parseInt(aux[3]);

  	nHalstead = (nOperadoresDistintos/2) * (nOperandos/nOperandosDistintos);

  	nNodos = Integer.parseInt(aux[4]);
  	nArestas = Integer.parseInt(aux[5]);
  	nCCMcCabe = nArestas - nNodos + 2;


  	nCCMcCabe = Integer.parseInt(aux[6])+1;
  	nComentarios = Integer.parseInt(aux[7]);
  	nLinhas = Integer.parseInt(aux[8]);

      if(!repBase) strQuery = "INSERT INTO CaracProgramas (nComentarios,nLinhas,nFuncoes,nErros,tempo,nCCMcCabe,nHalstead," +
                        "programaTiger) VALUES (" + nComentarios + "," + nLinhas + "," + nFuncoes + "," + nErros + "," + ms + "," +
                        nCCMcCabe + "," + nHalstead + "," + idFicheiro + ")";
      else strQuery = "INSERT INTO CaracProgramas (nComentarios,nLinhas,nFuncoes,nErros,tempo,nCCMcCabe,nHalstead) VALUES (" +
                        nComentarios + "," + nLinhas + "," + nFuncoes + "," + nErros + "," + ms + "," + nCCMcCabe + "," +
                        nHalstead + ")";
      valid = st.executeUpdate(strQuery, Statement.RETURN_GENERATED_KEYS);
      if(valid == 0) throw new SQLException("Creating CaracPrograma failed, no rows affected.");
      generatedKeys = st.getGeneratedKeys();
      if (generatedKeys.next()) idCarac = generatedKeys.getLong(1);
      else throw new SQLException("Creating CaracPrograma failed, no generated key obtained.");
      System.out.println("Query Executed Successfully (Caracteristicas) with the id " + idCarac + "!");

      //Se se tratar de um pedido de submissao para avaliacao, entao vai correr a funcao avaliacao e fazer o update
      //Caso seja uma submissao no repositorioBase, apenas vai atualizar o campo com a chave do idCarc
      if (!repBase){
        //Vai buscar as metricas actuais
        strQuery = "SELECT * FROM PesoMetricas ORDER BY id DESC LIMIT 1";
        metricas = st.executeQuery(strQuery);
        while (metricas.next()) { // process results one row at a time
          idMetrica = metricas.getLong(1);
          pesoComentarios = metricas.getFloat(2);
          pesoLinhas = metricas.getFloat(3);
          pesoFuncoes = metricas.getFloat(4);
          pesoErros = metricas.getFloat(5);
          pesoTempo = metricas.getFloat(6);
          pesoCCMcCabe = metricas.getFloat(7);
          pesoHalstead = metricas.getFloat(8);
        }

        System.out.println("Query Executed Successfully (CaracProgramaPesoMetrica)!");

        strQuery = "SELECT * FROM valorespadrao";
        result = st.executeQuery(strQuery);
        System.out.println("Query Executed Successfully (valorespadrao)!");

        //Transforma os valores obtidos das caracteristicas em estrelas, de 1 a 5
        ValoresPadrao vp = new ValoresPadrao();
        getEstrelas(vp, result, nComentarios, nLinhas, nFuncoes, nErros, ms, nCCMcCabe, nHalstead);

        //Faz a avaliacao do programa com as metricas e com as caracteristicas
        int avaliacao = avaliacao(vp, pesoComentarios, pesoLinhas, pesoFuncoes, pesoErros, pesoTempo, pesoCCMcCabe, pesoHalstead);

        //Faz update na tabela programaTiger com a avaliacao obtida
        strQuery = "UPDATE ProgramaTigers SET avaliacao = " + avaliacao + " WHERE id = " + idFicheiro;
        valid = st.executeUpdate(strQuery);
        if(valid == 0) throw new SQLException("Updating CaracPrograma failed, no rows affected.");

        //Verfica a avalicao obtida e consoante isso, coloca o id do ficheiro no repositorio de bons ficheiros ou de maus ficheiros
        if(avaliacao < 4){
          strQuery = "INSERT INTO MauProgramas VALUES (" + idFicheiro + ")";
          valid = st.executeUpdate(strQuery);
          if(valid == 0) throw new SQLException("Creating MauPrograma failed, no rows affected.");
          System.out.println("Query Executed Successfully (MauPrograma)!");
        }
        else{
          strQuery = "INSERT INTO BomProgramas VALUES (" + idFicheiro + ")";
          valid = st.executeUpdate(strQuery);
          if(valid == 0) throw new SQLException("Creating BomPrograma failed, no rows affected.");
          System.out.println("Query Executed Successfully (BomPrograma)!");
        }

        //Insere na tabela intermedia com o idCaracteristica e com o idMetrica
        strQuery = "INSERT INTO CaracProgramaPesoMetrica (caracPrograma,pesoMetrica) VALUES (" +
              idCarac + "," + idMetrica + ")";
        valid = st.executeUpdate(strQuery);
        if(valid == 0) throw new SQLException("Creating CaracPrograma failed, no rows affected.");
      }
      else{
        strQuery = "UPDATE RepositorioBase SET caracPrograma = " + idCarac + " WHERE id = " + idFicheiro;
        valid = st.executeUpdate(strQuery);
        if(valid == 0) throw new SQLException("Updating RepositorioBase failed, no rows affected.");
        System.out.println("Query Executed Successfully (RepositorioBase)!");
      }
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (generatedKeys != null) try { generatedKeys.close(); } catch (SQLException logOrIgnore) {}
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }

    if (valid == 1){
      if(!repBase) res.sendRedirect("ResultsAction?idCarac=" + idCarac);
      else res.sendRedirect("ResultsAction?idCarac=" + idCarac + "&rb=1");
    }
    else {
      req.getRequestDispatcher("/error.jsp").forward(req, res);
    }
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }

  private void getEstrelas(ValoresPadrao vp, ResultSet result, int nComentarios, int nLinhas, int nFuncoes, int nErros, int ms,
                           int nCCMcCabe, int nHalstead) throws SQLException{

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

    //Coloca o valor das estrelas das caracteristicas (individuais) no vp
    vp.setnComentariosM(estrelasComentarios);
    vp.setnLinhasM(estrelasLinhas);
    vp.setnFuncoesM(estrelasFuncoes);
    vp.setnErrosM(estrelasErros);
    vp.setnTempoM(estrelasTempo);
    vp.setnCCMcCabeM(estrelasCCMcCabe);
    vp.setnHalsteadM(estrelasHalstead);
  }

  private int avaliacao(ValoresPadrao vp, float pesoComent, float pesoLinhas, float pesoFuncoes, float pesoErros, float pesoTempo,
                         float pesoCCMcCabe, float pesoHalstead) {

    int estrelasComentarios = (int) vp.getnComentariosM();
    int estrelasLinhas = (int) vp.getnLinhasM();
    int estrelasFuncoes = (int) vp.getnFuncoesM();
    int estrelasErros = (int) vp.getnErrosM();
    int estrelasTempo = (int) vp.getnTempoM();
    int estrelasCCMcCabe = (int) vp.getnCCMcCabeM();
    int estrelasHalstead = (int) vp.getnHalsteadM();

    //Calcula o numero de estrelas global
    float resultado = 0;
    resultado = estrelasComentarios * pesoComent + estrelasLinhas * pesoLinhas + estrelasFuncoes * pesoFuncoes +
          estrelasErros * pesoErros + estrelasTempo * pesoTempo + estrelasCCMcCabe * pesoCCMcCabe +
          estrelasHalstead * pesoHalstead;
    return Math.round(resultado);
  }

}

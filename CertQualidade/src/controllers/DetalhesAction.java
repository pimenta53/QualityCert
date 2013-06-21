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

import models.Caracteristicas;
import models.ISO9126;
import models.ValoresPadrao;

import com.mysql.jdbc.Statement;

@WebServlet("/DetalhesAction")
public class DetalhesAction extends HttpServlet {
  private static final long serialVersionUID = 19L;
  
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    boolean repBase = false;
    if(req.getParameter("booleanRep") != null) repBase = true;
    long idProg = Long.parseLong(req.getParameter("idPrograma"));
    long idCarac = 0;
    ResultSet result = null;
    //req.setAttribute("booleanRep", repBase);
    
    //ir buscar toda a informacao que se pretende apresentar
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
      
      //Vai buscar os valores padr‹o atuais sobre os quais Ž feita a avalia‹o
      strQuery = "SELECT * FROM valorespadrao";
      result = st.executeQuery(strQuery);
      ValoresPadrao vp = new ValoresPadrao();
      while(result.next()){
        vp.setnComentariosM(result.getFloat(1));
        vp.setnLinhasM(result.getFloat(2));
        vp.setnFuncoesM(result.getFloat(3));
        vp.setnErrosM(result.getFloat(4));
        vp.setnTempoM(result.getFloat(5));
        vp.setnCCMcCabeM(result.getFloat(6));
        vp.setnHalsteadM(result.getFloat(7));
      }
      System.out.println("Query Executed Successfully (valorespadrao)!");
      req.setAttribute("Vp", vp);//Conjunto de valores padr‹o para serem mostrados na view
      
      //Se for um ficheiro do repBase, entao vai buscar o id da caracteristica
      if(repBase){
        strQuery = "SELECT caracPrograma FROM RepositorioBase WHERE id = " + idProg;
        result = st.executeQuery(strQuery);
        if(result.next()) idCarac = result.getLong(1);
        System.out.println("Query Executed Successfully (RepositorioBase)!");
      }
      
      //se idCarac Ž zero, entao Ž um programaTiger e faz match com a chave estrangeira. Senao, faz match entre o id e o idCarac
      if (idCarac == 0) strQuery = "SELECT * FROM CaracProgramas WHERE programaTiger = " + idProg;
      else strQuery = "SELECT * FROM CaracProgramas WHERE id = " + idCarac;
      result = st.executeQuery(strQuery);
      Caracteristicas carac = new Caracteristicas();
      if (result.next()) {
        carac.setnComentarios(result.getInt(2));
        carac.setnLinhas(result.getInt(3));
        carac.setnFuncoes(result.getInt(4));
        carac.setnErros(result.getInt(5));
        carac.setTempo(result.getInt(6));
        carac.setnCCMcCabe(result.getInt(7));
        carac.setnHalstead(result.getInt(8));
        if(result.getObject(9) != null) carac.setProgramaTiger(result.getInt(9));
        req.setAttribute("Carac", carac);
      }
      System.out.println("Query Executed Successfully (CaracProgramas)!");
      
      //Obter as estrelas a nivel individual das caracteristicas
      ValoresPadrao caracIndiv = new ValoresPadrao();
      getEstrelas(vp,carac, caracIndiv);
      req.setAttribute("EstrelasIndiv", caracIndiv);
      
      //Vai calcular as estrelas para cada categoria do modelo ISO9126
      ISO9126 iso = new ISO9126();
      //Confianca
      int estConf = Math.round(caracIndiv.getnLinhasM() * (float)0.5 + caracIndiv.getnErrosM() * (float)0.5);
      iso.setConfianca(estConf);
      //Adequacao
      int estAdeq = (int)caracIndiv.getnComentariosM();
      iso.setAdequacao(estAdeq);
      //Maturidade
      int estMat = Math.round(caracIndiv.getnCCMcCabeM() * (float)0.25 + caracIndiv.getnHalsteadM() * (float)0.25 +
                              caracIndiv.getnErrosM() * (float)0.25 + caracIndiv.getnFuncoesM() * (float)0.25);
      iso.setMaturidade(estMat);
      //Tolerancia a Falhas
      int estTol = Math.round(caracIndiv.getnLinhasM() * (float)0.25 + caracIndiv.getnCCMcCabeM() * (float)0.25 + 
                              caracIndiv.getnHalsteadM() * (float)0.25 + caracIndiv.getnErrosM() * (float)0.25);
      iso.setToleranciaFalhas(estTol);
      //Inteligibilidade
      int estInt = Math.round(caracIndiv.getnLinhasM() * (float)0.2 + caracIndiv.getnCCMcCabeM() * (float)0.2 + 
                              caracIndiv.getnHalsteadM() * (float)0.2 + caracIndiv.getnComentariosM() * (float)0.2 +
                              caracIndiv.getnFuncoesM() * (float)0.2);
      iso.setInteligibilidade(estInt);
      //Apreensibilidade
      int estApr = Math.round(caracIndiv.getnLinhasM() * (float)0.25 + caracIndiv.getnCCMcCabeM() * (float)0.25 + 
                              caracIndiv.getnComentariosM() * (float)0.25 + caracIndiv.getnFuncoesM() * (float)0.25);
      iso.setApreensibilidade(estApr);
      //Utilizacao de Recursos
      int estUtilRec = Math.round(caracIndiv.getnCCMcCabeM() * (float)0.5 + caracIndiv.getnHalsteadM() * (float)0.5);
      iso.setUtilizacaoRecursos(estUtilRec);
      //Analisabilidade
      int estAna = Math.round(caracIndiv.getnLinhasM() * (float)0.2 + caracIndiv.getnCCMcCabeM() * (float)0.2 + 
                              caracIndiv.getnHalsteadM() * (float)0.2 + caracIndiv.getnErrosM() * (float)0.2 +
                              caracIndiv.getnFuncoesM() * (float)0.2);
      iso.setAnalisabilidade(estAna);
      //Adaptabilidade
      int estAdapt = Math.round(caracIndiv.getnCCMcCabeM() * (float)0.5 + caracIndiv.getnFuncoesM() * (float)0.5);
      iso.setAdaptabilidade(estAdapt);
      req.setAttribute("ISO", iso);
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    
    req.getRequestDispatcher("/detalhes.jsp").forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
  
  private void getEstrelas(ValoresPadrao vp, Caracteristicas c, ValoresPadrao cInd){

    float nComentariosVP = vp.getnComentariosM();
    float nLinhasVP = vp.getnLinhasM();
    float nFuncoesVP = vp.getnFuncoesM();
    float nErrosVP = vp.getnErrosM();
    float nTempoVP = vp.getnTempoM();
    float nCCMcCabeVP = vp.getnCCMcCabeM();
    float nHalsteadVP = vp.getnHalsteadM();

    int nComentarios = c.getnComentarios();
    int nLinhas = c.getnLinhas();
    int nFuncoes = c.getnFuncoes();
    int nErros = c.getnErros();
    int nTempo = c.getTempo();
    int nCCMcCabe = c.getnCCMcCabe();
    int nHalstead = c.getnHalstead();
    
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
    if (nTempo < nTempoVP - nLinhas * 0.5) estrelasTempo = 5;
    else if ((nTempo >= nTempoVP - nLinhas * 0.5) && (nTempo <= nTempoVP + nLinhas * 0.5)) estrelasTempo = 4;
    else if (nTempo < nTempoVP + nLinhas) estrelasTempo = 3;
    else if (nTempo < nTempoVP + nLinhas * 1.5) estrelasTempo = 2;
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
    cInd.setnComentariosM(estrelasComentarios);
    cInd.setnLinhasM(estrelasLinhas);
    cInd.setnFuncoesM(estrelasFuncoes);
    cInd.setnErrosM(estrelasErros);
    cInd.setnTempoM(estrelasTempo);
    cInd.setnCCMcCabeM(estrelasCCMcCabe);
    cInd.setnHalsteadM(estrelasHalstead); 
  }
}
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
import models.ValoresPadrao;

import com.mysql.jdbc.Statement;

@WebServlet("/ResultsAction")
public class ResultsAction extends HttpServlet {
  private static final long serialVersionUID = 3L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    String forwardPage = "/results.jsp";
    long idCarac = 0, idProg = 0, idRep = 0;
    boolean repBase = false, repNew = false;
    if (req.getParameter("idCarac") != null) idCarac = Long.parseLong(req.getParameter("idCarac").toString());
    if (req.getParameter("prog") != null) idProg = Long.parseLong(req.getParameter("prog").toString());
    if (req.getParameter("rep") != null){
      repBase = true;
      idRep = Long.parseLong(req.getParameter("rep").toString());
    }
    if (req.getParameter("rb") != null) {
      repNew = true;
      repBase = true;
    }
    req.setAttribute("booleanRep", repBase);
    ResultSet result = null, resultU = null;
    Caracteristicas carac = new Caracteristicas();
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
      Statement stU = (Statement) conn.createStatement();
      
      //Se o request for do repositorioBase, entao vai buscar o id da caracteristica
      if(repBase && !repNew){
        strQuery = "SELECT id, nomeFicheiro, caracPrograma FROM RepositorioBase WHERE id = " + idRep;
        result = st.executeQuery(strQuery);
        while(result.next()){
          req.setAttribute("idF", result.getLong(1));
          req.setAttribute("nomF", result.getString(2));
          idCarac = result.getLong(3);
        }
      }

      //Vai buscar as caracteristicas do programa passado como parametro
      if (idCarac != 0) strQuery = "SELECT * FROM CaracProgramas WHERE id = " + idCarac;
      else if (idProg != 0) strQuery = "SELECT * FROM CaracProgramas WHERE programaTiger = " + idProg;
      result = st.executeQuery(strQuery);
      while (result.next()) { // process results one row at a time
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
      System.out.println("Query Executed Successfully! (CaracProgramas)");

      //Vai buscar a avaliacao desse programa caso o request nao seja do repositorio base
      if(!repBase){
        strQuery = "SELECT id, avaliacao, nomeFicheiro, utilizador FROM ProgramaTigers WHERE id = " + carac.getProgramaTiger();
        result = st.executeQuery(strQuery);
        while (result.next()) { // process results one row at a time
          req.setAttribute("idF", result.getLong(1));
          req.setAttribute("avaliacao",result.getInt(2));
          req.setAttribute("nomF", result.getString(3));
          resultU = stU.executeQuery("SELECT userName FROM Utilizadores WHERE id = " + result.getInt(4));
          if (resultU.next()) req.setAttribute("nomU", resultU.getString(1));
          }
        System.out.println("Query Executed Successfully! (ProgramaTigers)");
      }
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }

    req.getRequestDispatcher(forwardPage).forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

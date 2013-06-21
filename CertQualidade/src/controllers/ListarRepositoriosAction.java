package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ProgramaTiger;

import com.mysql.jdbc.Statement;

@WebServlet(urlPatterns={"/MausProgramas","/BonsProgramas"})
public class ListarRepositoriosAction extends HttpServlet {
  private static final long serialVersionUID = 9L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    ResultSet result = null, result2 = null, result3 = null, result4 = null;
    boolean mauP = true;

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "certQualidade";
    String driver = "com.mysql.jdbc.Driver";
    String username = "root";
    String userPassword = "root";
    String strQuery = null;

    //Verifica se foi requisitado os bons programas
    if (req.getRequestURI().contains("Bons")) mauP = false;

    try {
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url + dbName, username, userPassword);
      Statement st = (Statement) conn.createStatement();
      Statement st2 = (Statement) conn.createStatement();
      Statement st3 = (Statement) conn.createStatement();
      Statement st4 = (Statement) conn.createStatement(); 

      //Vai buscar todos os ids que est‹o na tabela MausProgramas
      if (mauP) strQuery = "SELECT * FROM MauProgramas";
      else strQuery = "SELECT * FROM BomProgramas";
      result = st.executeQuery(strQuery);
      ArrayList<ProgramaTiger> ptList = new ArrayList<ProgramaTiger>();
      while (result.next()) { // process results one row at a time

        //para cada id, vai buscar a informacao correspondente ao programa
        result2 = st2.executeQuery("SELECT * FROM ProgramaTigers WHERE id = " + result.getInt(1));
        while(result2.next()){
          ProgramaTiger pt = new ProgramaTiger();
          pt.setId(result2.getLong(1));
          pt.setNome(result2.getString(2));
          pt.setDescricao(result2.getString(3));
          pt.setData(result2.getString(4));
          pt.setNomeFicheiro(result2.getString(5));
          pt.setAvaliacao(result2.getInt(6));
          result3 = st3.executeQuery("SELECT userName FROM utilizadores WHERE id = " + result2.getInt(7));
          if(result3.next()) pt.setUtilizador(result3.getString(1));
          result4 = st4.executeQuery("SELECT id FROM CaracProgramas WHERE programaTiger = " + result2.getLong(1));
          if(result4.next()) pt.setCaracP(result4.getLong(1));
          ptList.add(pt);
        }
      }
      req.setAttribute("indexProgramas", ptList);
      if(mauP) {
        System.out.println("Query Executed Successfully! (Indexacao dos Maus Programas)");
        req.setAttribute("servlet", "maus");
      }
      else {
        req.setAttribute("servlet", "bons");
        System.out.println("Query Executed Successfully! (Indexacao dos Bons Programas)");
      }

      strQuery = "SELECT caracPrograma FROM RepositorioBase";
      result = st.executeQuery(strQuery);
      TreeSet<Long> list = new TreeSet<Long>();
      while(result.next()) list.add(result.getLong(1));
      req.setAttribute("idsCarac", list);
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    req.getRequestDispatcher("/indexFicheiros.jsp").forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ProgramaTiger;
import models.RepositorioBase;

import com.mysql.jdbc.Statement;

@WebServlet("/RepositorioBaseAction")
public class RepositorioBaseAction extends HttpServlet {
  private static final long serialVersionUID = 13L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    
    ResultSet result = null;
    
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
      
      //Vai buscar todos os entradas na tabela RepositorioBase para as listar
      strQuery = "SELECT * FROM RepositorioBase";
      result = st.executeQuery(strQuery);
      ArrayList<RepositorioBase> rbList = new ArrayList<RepositorioBase>();
      while (result.next()) { // process results one row at a time
        RepositorioBase rb = new RepositorioBase();
        rb.setId(result.getLong(1));
        rb.setNomeFicheiro(result.getString(2));
        rb.setData(result.getString(3));
        rb.setCaracPrograma(result.getLong(4));
        rbList.add(rb);
      }
      req.setAttribute("indexRepositorioBase", rbList);
      System.out.println("Query Executed Successfully! (Indexacao do RepositorioBase)");
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    req.getRequestDispatcher("/indexRepositorioBase.jsp").forward(req, res);
  }
  
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

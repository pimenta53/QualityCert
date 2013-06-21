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

import models.Metricas;
import com.mysql.jdbc.Statement;

@WebServlet("/IndexarMetricas")
public class IndexarMetricas extends HttpServlet {
  private static final long serialVersionUID = 8L;

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

      //Vai buscar todos as metricas que ja foram usadas e ordena pela mais recente
      strQuery = "SELECT * FROM PesoMetricas ORDER BY id DESC";
      result = st.executeQuery(strQuery);
      ArrayList<Metricas> metList = new ArrayList<Metricas>();
      while (result.next()) { // process results one row at a time
        Metricas pt = new Metricas();
            pt.setPesoComentarios(result.getFloat(2));
            pt.setPesoLinhas(result.getFloat(3));
            pt.setPesoFuncoes(result.getFloat(4));
            pt.setPesoErros(result.getFloat(5));
            pt.setPesoTempo(result.getFloat(6));
            pt.setPesoCCMcCabe(result.getFloat(7));
            pt.setPesoHalstead(result.getFloat(8));
            pt.setData(result.getString(9));
            metList.add(pt);
          }
      req.setAttribute("indexMetricas", metList);
      System.out.println("Query Executed Successfully! (Indexacao de Metricas)");
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    req.getRequestDispatcher("/indexMetricas.jsp").forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

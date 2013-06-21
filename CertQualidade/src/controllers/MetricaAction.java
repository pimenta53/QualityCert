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

import models.Metricas;

import com.mysql.jdbc.Statement;

@WebServlet("/MetricaAction")
public class MetricaAction extends HttpServlet{
  private static final long serialVersionUID = 15L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
   
    ResultSet metricas = null;
    
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
    
      //Vai buscar as metricas actuais
      Statement st = (Statement) conn.createStatement();
      strQuery = "SELECT * FROM PesoMetricas ORDER BY id DESC LIMIT 1";
      metricas = st.executeQuery(strQuery);
      Metricas m = new Metricas();
      while (metricas.next()) { // process results one row at a time
        m.setPesoComentarios(metricas.getFloat(2));
        m.setPesoLinhas(metricas.getFloat(3));
        m.setPesoFuncoes(metricas.getFloat(4));
        m.setPesoErros(metricas.getFloat(5));
        m.setPesoTempo(metricas.getFloat(6));
        m.setPesoCCMcCabe(metricas.getFloat(7));
        m.setPesoHalstead(metricas.getFloat(8));
      }
    req.setAttribute("metricaAtual", m);
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    req.getRequestDispatcher("/novaMetrica.jsp").forward(req, res);
  }
  
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

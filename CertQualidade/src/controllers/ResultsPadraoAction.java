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

import models.ValoresPadrao;

import com.mysql.jdbc.Statement;

@WebServlet("/ResultsPadraoAction")
public class ResultsPadraoAction extends HttpServlet {
  private static final long serialVersionUID = 19L;
  

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
      req.setAttribute("Vp", vp);
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    
    req.getRequestDispatcher("valoresPadrao.jsp").forward(req, res);
  }


  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

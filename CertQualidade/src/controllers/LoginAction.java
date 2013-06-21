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
import javax.servlet.http.HttpSession;

import models.Utilizador;

import com.mysql.jdbc.Statement;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet{
  private static final long serialVersionUID = 5L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    String nomeUtilizador = req.getParameter("username");
    String pass = req.getParameter("password");
    ResultSet result = null;
    boolean correcto = false;


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

      //Procura um utilizador com o nome dado e compara-o com a pass desse utilizador
      strQuery = "SELECT * FROM Utilizadores WHERE userName = '" + nomeUtilizador + "'";
      result = st.executeQuery(strQuery);
      while (result.next()) { // process results one row at a time
            correcto = pass.equals(result.getString(3));
            if (correcto){
              Utilizador util = new Utilizador();
              util.setId(result.getLong(1));
              util.setUsername(nomeUtilizador);
              util.setEmail(result.getString(4));
              util.setPassword(pass);
              util.setGrupo(result.getLong(5));
              HttpSession session = req.getSession();
              session.setAttribute("utilizador", util);
            }
        }
      System.out.println("Query Executed Successfully! (Utilizadores)");
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }

    if (correcto){
      res.sendRedirect("submeterCodigo.jsp");
    }
    else req.getRequestDispatcher("/error.jsp").forward(req, res);

  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }

}

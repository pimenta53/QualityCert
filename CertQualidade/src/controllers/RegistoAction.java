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

@WebServlet("/RegistoAction")
public class RegistoAction extends HttpServlet {
  private static final long serialVersionUID = 4L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    String button = req.getParameter("login");
    int valid = 0;
    //grupo = 2 pois trata-se de um utilizador normal
    int grupo = 2;
    ResultSet generatedKeys = null;
    long idUtilizador = 0;

    if (button.equals("J‡ estou registado!"))
      res.sendRedirect("login.jsp");
    else{
      String nomeUtilizador = req.getParameter("username");
      String email = req.getParameter("email");
      String pass = req.getParameter("password");

      //Se os tres campos estao preenchidos
      if (!nomeUtilizador.isEmpty() && !email.isEmpty() && !pass.isEmpty()){

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

          //Insere o utilizador na base de dados
          Statement st = (Statement) conn.createStatement();
          strQuery = "INSERT INTO Utilizadores (userName,password,email,grupo) VALUES ('" + nomeUtilizador + "','" +
                  pass + "','" + email + "'," + grupo + ")";
          valid = st.executeUpdate(strQuery, Statement.RETURN_GENERATED_KEYS);
          if(valid == 0) throw new SQLException("Creating CaracPrograma failed, no rows affected.");
          generatedKeys = st.getGeneratedKeys();
              if (generatedKeys.next()) idUtilizador = generatedKeys.getLong(1);
              else throw new SQLException("Creating Utilizador failed, no generated key obtained.");
          System.out.println("Query Executed Successfully (Utilizador) with the id " + idUtilizador + "!");
        }
        catch (Exception e) {e.printStackTrace();}
        finally {
          if (generatedKeys != null) try { generatedKeys.close(); } catch (SQLException logOrIgnore) {}
          if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
        }
      }

      if (valid == 1){
        HttpSession session = req.getSession();
        Utilizador util = new Utilizador();
        util.setId(idUtilizador);
        util.setUsername(nomeUtilizador);
        util.setEmail(email);
        util.setPassword(pass);
        util.setGrupo(grupo);
        session.setAttribute("utilizador", util);
        res.sendRedirect("submeterCodigo.jsp");
      }
      else {
        req.getRequestDispatcher("/error.jsp").forward(req, res);
      }
    }
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

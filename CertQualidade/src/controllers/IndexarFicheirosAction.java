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
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Statement;

import models.ProgramaTiger;
import models.Utilizador;

@WebServlet("/IndexarFicheirosAction")
public class IndexarFicheirosAction extends HttpServlet {
  private static final long serialVersionUID = 7L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    //Verifica se o utilizador logado Ž administrador ou utilizador normal
    boolean admin = false;
    HttpSession session = req.getSession();
    Utilizador u = (Utilizador) session.getAttribute("utilizador");
    if (u.getGrupo() == 1) admin = true;
    ResultSet result = null, rU = null;

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
      Statement st2 = (Statement) conn.createStatement();

      //Vai buscar todos os programas submetidos (ou do utilizador ou de todo o sistema(se admin))
      if (admin) strQuery = "SELECT * FROM ProgramaTigers";
      else strQuery = "SELECT * FROM ProgramaTigers WHERE utilizador = " + u.getId();
      result = st.executeQuery(strQuery);
      ArrayList<ProgramaTiger> ptList = new ArrayList<ProgramaTiger>();
      while (result.next()) { // process results one row at a time
        ProgramaTiger pt = new ProgramaTiger();
            pt.setId(result.getLong(1));
            pt.setNome(result.getString(2));
            pt.setDescricao(result.getString(3));
            pt.setData(result.getString(4));
            pt.setNomeFicheiro(result.getString(5));
            pt.setAvaliacao(result.getInt(6));
            if (!admin) pt.setUtilizador(null);
            else{
              rU = st2.executeQuery("SELECT userName FROM utilizadores WHERE id = " + result.getInt(7));
              if(rU.next()) pt.setUtilizador(rU.getString(1));
            }
            ptList.add(pt);
          }
      req.setAttribute("indexProgramas", ptList);
      System.out.println("Query Executed Successfully! (Indexacao de ProgramaTiger)");
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

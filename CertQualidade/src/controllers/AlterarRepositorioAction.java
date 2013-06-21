package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

@WebServlet("/AlterarRepositorioAction")
public class AlterarRepositorioAction extends HttpServlet {
  private static final long serialVersionUID = 10L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    boolean mauP = false;
    if (req.getParameter("repositorioMau") != null) mauP = true;
    int valid = 0;
    int idPrograma = Integer.parseInt(req.getParameter("idPrograma"));

    System.out.println("" + idPrograma + mauP);
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

      //elimina o id da tabela
      if (mauP) strQuery = "DELETE FROM MauProgramas WHERE programaTiger = " + idPrograma;
      else strQuery = "DELETE FROM BomProgramas WHERE programaTiger = " + idPrograma;
      valid = st.executeUpdate(strQuery);
      if(valid == 0) throw new SQLException("Deleting failed, no rows affected.");
      System.out.println("Query Executed Successfully! (Eliminar Linha)");

      //coloca no outro repositorio
      if (mauP) strQuery = "INSERT INTO BomProgramas VALUES (" + idPrograma + ")";
      else strQuery = "INSERT INTO MauProgramas VALUES (" + idPrograma + ")";
      valid = st.executeUpdate(strQuery);
      if(valid == 0) throw new SQLException("Creating failed, no rows affected.");

      System.out.println("Query Executed Successfully! (Inserir Linha)");
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }

    if(mauP) res.sendRedirect("MausProgramas");
    else res.sendRedirect("BonsProgramas");
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

package controllers;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

@WebServlet("/EliminarFicheiroAction")
public class EliminarFicheiroAction extends HttpServlet {
  private static final long serialVersionUID = 16L;
  
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    int idPrograma = Integer.parseInt(req.getParameter("idPrograma"));
    String nomeFicheiro = req.getParameter("nomePrograma");
    int valid = 0, idCarac = 0;
    ResultSet result = null;
    boolean programa = false;
    //Neste passo vai buscar o endereco atual do projeto no eclipse
    String str = new File(getServletContext().getRealPath("/")).getParentFile().getParentFile().
        getParentFile().getParentFile().getParentFile().getParentFile().getPath();
    
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
      
      //Eliminar o ficheiro localmente
      File file = new File(str + "/CertQualidade/files/RepositorioBase/" + nomeFicheiro);
      if(file.delete()) System.out.println(file.getName() + " is deleted!");
      else System.out.println("Delete operation failed.");
      
      //Vai buscar o id da Caracteristica correspondente
      strQuery = "SELECT caracPrograma FROM RepositorioBase WHERE id = " + idPrograma;
      result = st.executeQuery(strQuery);
      while(result.next()){
        idCarac = result.getInt(1);
      }
      System.out.println("Query Executed Successfully with the id " + idCarac + "!");
      
      //Verifica se a linha do idCarac tem um programaTiger associado
      strQuery = "SELECT programaTiger FROM CaracProgramas WHERE id = " + idCarac;
      result = st.executeQuery(strQuery);
      while(result.next()){
        if (result.getObject(1) != null) programa = true;
      }
      
      //Eliminar a linha correspondente a este id na tabela RepositorioBase
      strQuery = "DELETE FROM RepositorioBase WHERE id = " + idPrograma;
      valid = st.executeUpdate(strQuery);
      if(valid == 0) throw new SQLException("Deleting RepositorioBase  failed, no rows affected.");

      System.out.println("Query Executed Successfully with the id " + idPrograma + "!");

      //Caso nao existe nenhum programaTiger associado, entao elimina a linha da tabela CaracPrograma
      //Caso exista um programaTiger associado, apenas elimina a linha na tabela Repositorio Base
      if(!programa){
        //Eliminar a linha na tabela CaracPrograma correspondente ao ficheiro do Repositorio Base
        strQuery = "DELETE FROM CaracProgramas WHERE id = " + idCarac;
        valid = st.executeUpdate(strQuery);
        if(valid == 0) throw new SQLException("Deleting CaracPrograma failed, no rows affected.");
        System.out.println("Query Executed Successfully with the id " + idCarac + "!");
      }
    }
    catch (Exception e) {e.printStackTrace();}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }
    req.getRequestDispatcher("RepositorioBaseAction").forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
}

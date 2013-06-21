package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

@WebServlet("/AdicionarAoRepositorioBaseAction")
public class AdicionarAoRepositorioBaseAction extends HttpServlet {
  private static final long serialVersionUID = 14L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    boolean mauP = false;
    if (req.getParameter("repositorioMau") != null) mauP = true;
    int idPrograma = Integer.parseInt(req.getParameter("idPrograma"));
    ResultSet programa = null;
    String nomeFicheiro = null, nomeUtilizador = null;
    long idCarac = 0, idUtilizador = 0;
    int valid = 0, count = 1;
    
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
      //Vai buscar o nome do ficheiro ˆ base de dados
      strQuery = "SELECT nomeFicheiro, utilizador FROM ProgramaTigers WHERE id = " + idPrograma;
      programa = st.executeQuery(strQuery);
      while(programa.next()){
        nomeFicheiro = programa.getString(1);
        idUtilizador = programa.getLong(2);
      }
      System.out.println("Query Executed Successfully for the file with the id " + idPrograma + "!");
      
      //Vai buscar o nome do utilizador a que este ficheiro pertence
      strQuery = "SELECT userName FROM Utilizadores WHERE id = " + idUtilizador;
      programa = st.executeQuery(strQuery);
      while(programa.next()){
        nomeUtilizador = programa.getString(1);
      }
      System.out.println("Query Executed Successfully for the file from the user " + nomeUtilizador + "!");
      
      //Vai buscar o id da caracteristica deste programa
      strQuery = "SELECT id FROM CaracProgramas WHERE programaTiger = " + idPrograma;
      programa = st.executeQuery(strQuery);
      while(programa.next()){
        idCarac = programa.getLong(1);
      }
      System.out.println("Query Executed Successfully for the file with the idCarac " + idCarac + "!");
      
      //Cria a diretoria do repositorio base caso ainda nao exista
      //Neste passo vai buscar o endereco atual do projeto no eclipse
      String str = new File(getServletContext().getRealPath("/")).getParentFile().getParentFile().
          getParentFile().getParentFile().getParentFile().getParentFile().getPath();
      new File(str + "/CertQualidade/files/RepositorioBase").mkdir();
      //Caso existam ficheiros com o mesmo nome!!
      File source = new File(str + "/CertQualidade/files/" + nomeUtilizador + "/" + nomeFicheiro);
      int IndexOf = nomeFicheiro.lastIndexOf(".");
      String domainName = nomeFicheiro.substring(IndexOf);
      String nomeF = nomeFicheiro.substring(0, IndexOf);
      File folder = new File(str + "/CertQualidade/files/RepositorioBase");
      String[] fileNames = folder.list();
      for (int i = 0; i< fileNames.length; i++)
        if (fileNames[i].contains(nomeF) && fileNames[i].contains(domainName)) count++;
      if (count > 1) nomeFicheiro = nomeF + count + domainName;
      File dest = new File (str + "/CertQualidade/files/RepositorioBase/" + nomeFicheiro);
      //Copia o ficheiro com o novo nome para a diretoria RepositorioBase
      copy(source,dest);
      
  
      //Insere o novo registo do ficheiro na tabela RepositorioBase
      strQuery = "INSERT INTO RepositorioBase (nomeFicheiro,caracPrograma) VALUES ('" + nomeFicheiro + "'," + idCarac + ")";
      valid = st.executeUpdate(strQuery);
      if(valid == 0) throw new SQLException("Creating RepositorioBase failed, no rows affected.");
    }
    catch (Exception e) {System.out.println(e.getMessage());}
    finally {
      if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
    }

    if(mauP) res.sendRedirect("MausProgramas");
    else res.sendRedirect("BonsProgramas");
  }
  
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req, res);
  }
  
  private void copy(File source, File target) throws IOException {

    InputStream in = new FileInputStream(source);
    OutputStream out = new FileOutputStream(target);

    // Copy the bits from instream to outstream
    byte[] buf = new byte[1024];
    int len;

    while ((len = in.read(buf)) > 0) {
        out.write(buf, 0, len);
    }

    in.close();
    out.close();
  }
}

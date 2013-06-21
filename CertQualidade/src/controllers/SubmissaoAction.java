package controllers;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Utilizador;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.mysql.jdbc.Statement;


@WebServlet("/SubmissaoAction")
public class SubmissaoAction extends HttpServlet{
  private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException{

    String nome = null, descricao = null, nomeFicheiro = null;
    int valid = 0, count = 1, countForm = 0;
    boolean repBase = false;
    long idFicheiro = 0;
    ResultSet generatedKeys = null;
    HttpSession session = request.getSession();
    Utilizador u = (Utilizador) session.getAttribute("utilizador");
    //Neste passo vai buscar o endereco atual do projeto no eclipse
    String str = new File(getServletContext().getRealPath("/")).getParentFile().getParentFile().
        getParentFile().getParentFile().getParentFile().getParentFile().getPath();

    System.out.println(str);

    //Le e guarda ficheiro
    PrintWriter out = response.getWriter();
    boolean isMultipart = ServletFileUpload.isMultipartContent(request);
    if (!isMultipart) {
      System.out.println("File Not Uploaded!");
    } else {
      FileItemFactory factory = new DiskFileItemFactory();
      ServletFileUpload upload = new ServletFileUpload(factory);
      List items = null;

      try {
        items = upload.parseRequest(request);
        System.out.println("items: " + items);
        } catch (FileUploadException e) {e.printStackTrace();}

      Iterator itr = items.iterator();
      while (itr.hasNext()) {
        FileItem item = (FileItem) itr.next();
        if (item.isFormField()){
          //Verifica o nome do campo do formulario, e consoante esse nome, vai buscar o valor introduzido e atribui ˆ respectiva
          //variavel
          String name = item.getFieldName();
          if (name.equals("nome")) nome = item.getString();
          else if (name.equals("descricao")) descricao = item.getString();
          //Conta quantos campos para inserir dados existem (ao submeter codigo, existem 2; mas se for pelo repositorioBase
          //n‹o existe nenhum)
          countForm++;
        } else {
          try {
            //Caso chegue ˆ parte em que Ž para ir buscar o ficheiro, e neste formulario ainda nao existiu nenhum outro campo
            //entao significa que o pedido veio do repBase
            if (countForm == 0) repBase = true;
            nomeFicheiro = item.getName();

            String reg = "[.*]";
            String replacingtext = "";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(nomeFicheiro);
            StringBuffer buffer = new StringBuffer();

            while (matcher.find()) matcher.appendReplacement(buffer, replacingtext);

            int IndexOf = nomeFicheiro.lastIndexOf(".");
            String domainName = nomeFicheiro.substring(IndexOf);
            String nomeF = nomeFicheiro.substring(0, IndexOf);

            System.out.println("Domain Name: " + domainName);
            System.out.println("File Name: " + nomeF);
            System.out.println("Final File: " + nomeFicheiro);

            if (!repBase) new File(str + "\\CertQualidade\\files\\" + u.getUsername()).mkdir();
            else new File(str + "/CertQualidade/files/RepositorioBase").mkdir();

            //Caso existam ficheiros com o mesmo nome!!
            File folder = null;
            if (!repBase) folder = new File(str + "\\CertQualidade\\files\\" + u.getUsername());
            else folder = new File(str + "/CertQualidade/files/RepositorioBase");
            String[] fileNames = folder.list();
            for (int i = 0; i< fileNames.length; i++)
              if (fileNames[i].contains(nomeF) && fileNames[i].contains(domainName)) count++;

            if (count > 1) nomeFicheiro = nomeF + count + domainName;

            //Grava o ficheiro com o nome dado ou com o novo nome
            File savedFile = null;
            if (!repBase) savedFile = new File(str + "\\CertQualidade\\files\\"
                                                + u.getUsername() + "/" + nomeFicheiro);
            else savedFile = new File(str + "/CertQualidade/files/RepositorioBase/" + nomeFicheiro);

            item.write(savedFile);

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
              //Insere os dados do ficheiro submetido na base de dados (tabela ProgramaTigers ou RepositorioBase) dependendo de onde
              //foi executado o pedido
              if (!repBase) strQuery = "INSERT INTO ProgramaTigers (nome, descricao, nomeFicheiro, utilizador) VALUES ('" +
                                        nome +"','" + descricao + "','" + nomeFicheiro + "'," + u.getId() + ")";
              else strQuery = "INSERT INTO RepositorioBase (nomeFicheiro) VALUES ('" + nomeFicheiro + "')";
              valid = st.executeUpdate(strQuery, Statement.RETURN_GENERATED_KEYS);
              if(valid == 0) {
                if(!repBase) throw new SQLException("Creating ProgramaTiger failed, no rows affected.");
                else throw new SQLException("Creating RepositorioBase failed, no rows affected.");
              }

              generatedKeys = st.getGeneratedKeys();
                  if (generatedKeys.next()) idFicheiro = generatedKeys.getLong(1);
                  else {
                    if (!repBase) throw new SQLException("Creating ProgramaTiger failed, no generated key obtained.");
                    else throw new SQLException("Creating RepositorioBase failed, no generated key obtained.");
                  }

              System.out.println("Query Executed Successfully with the id " + idFicheiro + "!");
            }
            catch (Exception e) {System.out.println(e.getMessage());}
            finally {
              if (generatedKeys != null) try { generatedKeys.close(); } catch (SQLException logOrIgnore) {}
              if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
            }
          } catch (Exception e) {e.printStackTrace();}
        }
      }
    }
    if (valid == 1){
      if(!repBase) request.setAttribute("idFicheiroS", idFicheiro);
      else request.setAttribute("idFicheiroRB", idFicheiro);
      request.getRequestDispatcher("ParserAction").forward(request, response);
    }
    else {
      request.getRequestDispatcher("/error.jsp").forward(request, response);
    }
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException{
    doGet(request, response);
  }
}

package controllers;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadAction")
public class DownloadAction extends HttpServlet {
  private static final long serialVersionUID = 12L;

  @SuppressWarnings("deprecation")
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    String nomeU = null, nomeF = null, file = null;
    if (req.getParameter("file") != null) nomeF = req.getParameter("file");
    if (req.getParameter("nome") != null) nomeU = req.getParameter("nome");
    PrintWriter out = res.getWriter();
    //Neste passo vai buscar o endereco atual do projeto no eclipse
    String str = new File(getServletContext().getRealPath("/")).getParentFile().getParentFile().
        getParentFile().getParentFile().getParentFile().getParentFile().getPath();

    if(nomeU != null) file = str + "/CertQualidade/files/" + nomeU + "/" + nomeF;
    else file = str + "/CertQualidade/files/RepositorioBase/" + nomeF;
    File f = new File(file);

    res.setContentType("application/force-download");
      res.setContentLength((int)f.length());
      res.setHeader("Content-Transfer-Encoding", "binary");
      res.setHeader("Content-Disposition","attachment; filename=\"" + nomeF + "\"");

    InputStream in = new FileInputStream(f);
      BufferedInputStream bin = new BufferedInputStream(in);
      DataInputStream din = new DataInputStream(bin);

      while(din.available() > 0){
          out.print(din.readLine());
          out.print("\n");
      }
      in.close();
      bin.close();
      din.close();
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req,res);
  }
}

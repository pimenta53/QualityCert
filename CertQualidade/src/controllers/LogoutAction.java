package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutAction")
public class LogoutAction extends HttpServlet {
  private static final long serialVersionUID = 6L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{

    //Verifica se existe o atributo utilizador na sessao e caso existe, destroi-o
    HttpSession session = req.getSession();
    if(session.getAttribute("utilizador") != null) session.removeAttribute("utilizador");

    req.getRequestDispatcher("/login.jsp").forward(req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException{
    doGet(req,res);
  }

}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
  <!-- loginAdmin.jsp -->
  <h2>Efectue a sua autenticação</h2>
  <form method="POST" action="http:LoginAction" name="autenticacao">
    <table>
      <tr>
        <td>Nome de Utilizador: </td>
        <td><input type="text" name="username" size="15" maxlength="30" /></td>
      </tr>
      <tr>
        <td>Palavra-passe: </td>
        <td><input type="password" name="password" size="15" maxlength="30" /></td>
      </tr>
    </table>
    <p>
      <input type="submit" name="login" value="Iniciar Sessão">
      <!-- input
        type="submit" name="requestPass"
        value="Esqueceste-te da tua palavra-passe?"-->
    </p>
  </form>
<%@ include file="footer.html"%>
</body>
</html>

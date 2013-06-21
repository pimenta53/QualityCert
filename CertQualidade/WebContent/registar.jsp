<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registo</title>
</head>
<body>
<h2>Registe-se e usufrua das funcionalidades oferecidas</h2>
  <form method="POST" action="http:RegistoAction" name="registo">
    <table>
      <tr>
        <td>Nome de Utilizador: </td>
        <td> <input type="text" name="username" size="30" maxlength="30" /></td>
      </tr>
      <tr>
        <td>Email: </td>
        <td> <input type="text" name="email" size="30" maxlength="30" /> </td>
      </tr>
      <tr>
        <td>Palavra-passe: </td>
        <td> <input type="password" name="password" size="30" maxlength="30" /></td>
      </tr>
    </table>
    <p>
      <input type="submit" name="login" value="Concluir Registo">
      <input type="submit" name="login" value="Já estou registado!">
    </p>
  </form>
<%@ include file="footer.html"%>
</body>
</html>

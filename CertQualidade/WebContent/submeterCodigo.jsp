<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submiss�o</title>
</head>
<body>

<h3>Submeta o seu c�digo para avalia��o:</h3>
  <form method="POST" action="http:SubmissaoAction" name="submissao" enctype="multipart/form-data">
    <table>
      <tr>
        <td>Nome: </td>
        <td> <input type="text" name="nome" size="30" maxlength="30" /></td>
      </tr>
      <tr>
        <td>Descri��o: </td>
        <td> <textarea name="descricao" cols="40" rows="5"></textarea></td>
      </tr>
      <tr>
        <td>Ficheiro: </td>
        <td> <input type="file" name="codigo" size="30" /></td>
      </tr>
    </table>
    <p>
      <input type="submit" value="Submeter">
    </p>
  </form>
<%@ include file="footer.html"%>
</body>
</html>

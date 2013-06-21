<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reposit�rio Base</title>
</head>
<body>
  <h2>Programas do Reposit�rio Base</h2>
  <div>
  <form method="POST" action="http:RepBaseFormAction" name="adicionar">
    <input type="submit" name="repositorioBase" value="Adicionar Programa ao Reposit�rio">
    <input type="submit" name="repositorioBase" value="Atualizar Valores Padr�o">
  </form>
  </div>
    <c:forEach items="${indexRepositorioBase}" var="rep">
      <h3><a href="${pageContext.request.contextPath}/ResultsAction?rep=${rep.id}">${rep.nomeFicheiro}</a></h3>
      <ul>
        <li>Data de submiss�o: ${rep.data}</li>
      </ul>
      <form method="POST" action="http:EliminarFicheiroAction" name="eliminar">
          <input type=hidden name="idPrograma" value="${rep.id}">
          <input type=hidden name="nomePrograma" value="${rep.nomeFicheiro}">
          <input type="submit" name="repositorioBase" value="Eliminar do Reposit�rio">
      </form>
    </c:forEach>
<%@ include file="footer.html"%>
</body>
</html>
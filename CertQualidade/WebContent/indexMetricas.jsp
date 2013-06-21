<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Pesos</title>
</head>
<body>
  <h2>Listagem do conjunto de pesos criados:</h2>

  <c:forEach var="metrica" items="${indexMetricas}">
    <h3>${metrica.data}</h3>
    <ul>
      <li>Peso dos Comentários: ${metrica.pesoComentarios}</li>
      <li>Peso das Linhas: ${metrica.pesoLinhas}</li>
      <li>Peso das Funções: ${metrica.pesoFuncoes}</li>
      <li>Peso dos Erros: ${metrica.pesoErros}</li>
      <li>Peso do Tempo de Análise: ${metrica.pesoTempo}</li>
      <li>Peso da Complexidade Ciclomática de McCabe: ${metrica.pesoCCMcCabe}</li>
      <li>Peso das métricas de Halstead: ${metrica.pesoHalstead}</li>
    </ul>
  </c:forEach>
<%@ include file="footer.html"%>
</body>
</html>

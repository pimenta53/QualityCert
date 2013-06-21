<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.TreeSet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ficheiros Submetidos</title>
</head>
<body>
  <h2>Ficheiros Submetidos</h2>
    <% TreeSet<Integer> ts = (TreeSet) request.getAttribute("idsCarac"); %>
    <c:forEach items="${indexProgramas}" var="programa">
      <c:set var="id" value="${programa.caracP}"/>
      <c:set var="avalia" value="${programa.avaliacao}"/>
      <h3><a href="${pageContext.request.contextPath}/ResultsAction?prog=${programa.id}">${programa.nome}</a></h3>
      <ul>
        <li>Descrição: ${programa.descricao}</li>
        <li>Data de submissão: ${programa.data}</li>
        <li>Nome do Ficheiro: ${programa.nomeFicheiro}</li>
        <li>Avaliacao: 
          <% for(int i = 1; i <= (Integer)pageContext.getAttribute("avalia"); i++) {%>
            <img class="no-margin" src="images/star.png" title="star" width="1%">
          <% } %>
        </li>
        <c:if test="${programa.utilizador != null}"><li>Nome do Utilizador: ${programa.utilizador}</li></c:if>
      </ul>
      <% if (request.getAttribute("servlet") != null && request.getAttribute("servlet").toString().contains("bons")){%>
        <form method="POST" action="http:AlterarRepositorioAction" name="alterar">
          <input type=hidden name="idPrograma" value="${programa.id}">
          <input type="submit" name="repositorioBom" value="Alterar Repositório">
        </form>
      <%} %>
      <% if (request.getAttribute("servlet") != null && request.getAttribute("servlet").toString().contains("bons") &&
          !ts.contains((Long)pageContext.getAttribute("id"))){%>
        <form method="POST" action="http:AdicionarAoRepositorioBaseAction" name="adicionar">
          <input type=hidden name="idPrograma" value="${programa.id}">
          <input type="submit" name="repositorioBom" value="Adicionar ao Repositório Base">
        </form>
      <%} %>
      <% if (request.getAttribute("servlet") != null && request.getAttribute("servlet").toString().contains("maus")){%>
        <form method="POST" action="http:AlterarRepositorioAction" name="alterar">
          <input type=hidden name="idPrograma" value="${programa.id}">
          <input type="submit" name="repositorioMau" value="Alterar Repositório">
        </form>
      <%} %>
      <% if (request.getAttribute("servlet") != null && request.getAttribute("servlet").toString().contains("maus") &&
          !ts.contains((Long)pageContext.getAttribute("id"))){%>
        <form method="POST" action="http:AdicionarAoRepositorioBaseAction" name="adicionar">
          <input type=hidden name="idPrograma" value="${programa.id}">
          <input type="submit" name="repositorioMau" value="Adicionar ao Repositório Base">
        </form>
      <%} %>
    </c:forEach>
<%@ include file="footer.html"%>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultados</title>
</head>
<body>
  <h1>Análise concluída!</h1>
  <h3>Resultados obtidos segundo as seguintes métricas:</h3>
  <ul>
    <li><b>Número de Comentários:</b> ${Carac.nComentarios}</li>
    <li><b>Linhas de Código:</b> ${Carac.nLinhas}</li>
    <li><b>Número de Funções:</b> ${Carac.nFuncoes}</li>
    <li><b>Número de Erros:</b> ${Carac.nErros}</li>
    <li><b>Tempo demorado:</b> ${Carac.tempo}</li>
    <li><b>Complexidade Ciclomática de McCabe:</b> ${Carac.nCCMcCabe}</li>
    <li><b>Métricas de Halstead:</b> ${Carac.nHalstead}</li>
  </ul>
  <form method="GET" action="http:DetalhesAction" name="detalhes">
    <input type=hidden name="idPrograma" value="${idF}">
    <% if ((Boolean)request.getAttribute("booleanRep") == true) { %>
    <input type=hidden name="booleanRep" value="true">
    <% } %>
    <input type="submit" name="MaisDetalhes" value="Mais Detalhes...">
  </form>
  <br/>
  <% if ((Boolean)request.getAttribute("booleanRep") == false) { %>
  <h3>Avaliação Final</h3>
  <% for(int i = 1; i <= Integer.parseInt(request.getAttribute("avaliacao").toString()); i++) {%>
  <img class="no-margin" src="images/star.png" title="star">
  <% } %>
  <br/>
  <a href="DownloadAction?file=${nomF}&nome=${nomU}">Download</a>
  <% } else{ %>
  <a href="DownloadAction?file=${nomF}">Download</a>
  <% } %>
<%@ include file="footer.html"%>
</body>
</html>

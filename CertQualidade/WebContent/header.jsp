<%@ page import="models.Utilizador"%>

<div align="center">
 <P>
 <img class="no-margin" src="images/certQualidadeTiger.jpg" title="Banner" width="100%" height="225">
</div>
<div>
  <% Utilizador u = (Utilizador) session.getAttribute("utilizador");
  if (u == null) {%>
  <a href="${pageContext.request.contextPath}/login.jsp">Login</a>
  <a href="${pageContext.request.contextPath}/registar.jsp">Registo</a>
  <% } else if (u.getGrupo() == 1){ %>
  <a href="${pageContext.request.contextPath}/submeterCodigo.jsp">Submiss�o de C�digo</a>
  <a href="${pageContext.request.contextPath}/IndexarFicheirosAction">Submiss�es</a>
  <a href="${pageContext.request.contextPath}/IndexarMetricas">Historial de Pesos</a>
  <a href="${pageContext.request.contextPath}/MetricaAction">Novo Conjunto de Pesos</a>
  <a href="${pageContext.request.contextPath}/BonsProgramas">Bons Programas</a>
  <a href="${pageContext.request.contextPath}/MausProgramas">Maus Programas</a>
  <a href="${pageContext.request.contextPath}/RepositorioBaseAction">Reposit�rio Base</a>
  <a href="${pageContext.request.contextPath}/LogoutAction">Logout</a>
  <% } else if (u.getGrupo() == 2) { %>
  <a href="${pageContext.request.contextPath}/submeterCodigo.jsp">Submiss�o de C�digo</a>
  <a href="${pageContext.request.contextPath}/IndexarFicheirosAction">As minhas submiss�es</a>
  <a href="${pageContext.request.contextPath}/LogoutAction">Logout</a>
  <%} %>
</div>

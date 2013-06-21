<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="models.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Análise Detalhada</title>
</head>
<body>
<jsp:useBean id="ISO" class="models.ISO9126" scope="request">
</jsp:useBean>
<jsp:useBean id="EstrelasIndiv" class="models.ValoresPadrao" scope="request">
</jsp:useBean>
  <h1>Análise Detalhada do Código</h1>
  <h3>Características avaliadas:</h3>
  <ul>
    <li><b>Número de Comentários</b>: ${Carac.nComentarios} <font size = -1>(Valor Padrão: ${Vp.nComentariosM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnComentariosM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Linhas de Código</b>: ${Carac.nLinhas} <font size = -1>(Valor Padrão: ${Vp.nLinhasM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnLinhasM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Número de Funções</b>: ${Carac.nFuncoes} <font size = -1>(Valor Padrão: ${Vp.nFuncoesM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnFuncoesM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Número de Erros</b>: ${Carac.nErros} <font size = -1>(Valor Padrão: ${Vp.nErrosM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnErrosM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Tempo demorado</b>: ${Carac.tempo} <font size = -1>(Valor Padrão: ${Vp.nTempoM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnTempoM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Complexidade Ciclomática de McCabe</b>: ${Carac.nCCMcCabe} <font size = -1>(Valor Padrão: ${Vp.nCCMcCabeM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnCCMcCabeM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Métricas de Halstead</b>: ${Carac.nHalstead} <font size = -1>(Valor Padrão: ${Vp.nHalsteadM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnHalsteadM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
  </ul>

  <h3>Características da norma <b>ISO 9126</b> avaliadas:</h3>
  <ul>
    <li><b>Funcionalidade</b></li>
    <ul>
    <li>Confiança:
      <% for(int i = 1; i <= ISO.getConfianca(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    <li>Adequação:
      <% for(int i = 1; i <= ISO.getAdequacao(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Segurança</b></li>
    <ul>
    <li>Maturidade:
      <% for(int i = 1; i <= ISO.getMaturidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    <li>Tolerância a Falhas:
      <% for(int i = 1; i <= ISO.getToleranciaFalhas(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Usabilidade</b></li>
    <ul>
    <li>Inteligibilidade:
      <% for(int i = 1; i <= ISO.getInteligibilidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    <li>Apreensibilidade:
      <% for(int i = 1; i <= ISO.getApreensibilidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Eficiência</b></li>
    <ul>
    <li>Utilização de Recursos:
      <% for(int i = 1; i <= ISO.getUtilizacaoRecursos(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Manutenção</b></li>
    <ul>
    <li>Analisabilidade:
      <% for(int i = 1; i <= ISO.getAnalisabilidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Portabilidade</b></li>
    <ul>
    <li>Adaptabilidade:
      <% for(int i = 1; i <= ISO.getAdaptabilidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
  </ul>
<%@ include file="footer.html"%>
</body>
</html>
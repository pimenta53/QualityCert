<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="models.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>An�lise Detalhada</title>
</head>
<body>
<jsp:useBean id="ISO" class="models.ISO9126" scope="request">
</jsp:useBean>
<jsp:useBean id="EstrelasIndiv" class="models.ValoresPadrao" scope="request">
</jsp:useBean>
  <h1>An�lise Detalhada do C�digo</h1>
  <h3>Caracter�sticas avaliadas:</h3>
  <ul>
    <li><b>N�mero de Coment�rios</b>: ${Carac.nComentarios} <font size = -1>(Valor Padr�o: ${Vp.nComentariosM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnComentariosM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Linhas de C�digo</b>: ${Carac.nLinhas} <font size = -1>(Valor Padr�o: ${Vp.nLinhasM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnLinhasM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>N�mero de Fun��es</b>: ${Carac.nFuncoes} <font size = -1>(Valor Padr�o: ${Vp.nFuncoesM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnFuncoesM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>N�mero de Erros</b>: ${Carac.nErros} <font size = -1>(Valor Padr�o: ${Vp.nErrosM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnErrosM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Tempo demorado</b>: ${Carac.tempo} <font size = -1>(Valor Padr�o: ${Vp.nTempoM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnTempoM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>Complexidade Ciclom�tica de McCabe</b>: ${Carac.nCCMcCabe} <font size = -1>(Valor Padr�o: ${Vp.nCCMcCabeM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnCCMcCabeM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
    <li><b>M�tricas de Halstead</b>: ${Carac.nHalstead} <font size = -1>(Valor Padr�o: ${Vp.nHalsteadM})</font></li>
    <% for(int i = 1; i <= EstrelasIndiv.getnHalsteadM(); i++) {%>
      <img class="no-margin" src="images/star.png" title="star" width="1.5%">
    <% } %>
  </ul>

  <h3>Caracter�sticas da norma <b>ISO 9126</b> avaliadas:</h3>
  <ul>
    <li><b>Funcionalidade</b></li>
    <ul>
    <li>Confian�a:
      <% for(int i = 1; i <= ISO.getConfianca(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    <li>Adequa��o:
      <% for(int i = 1; i <= ISO.getAdequacao(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Seguran�a</b></li>
    <ul>
    <li>Maturidade:
      <% for(int i = 1; i <= ISO.getMaturidade(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    <li>Toler�ncia a Falhas:
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
    <li><b>Efici�ncia</b></li>
    <ul>
    <li>Utiliza��o de Recursos:
      <% for(int i = 1; i <= ISO.getUtilizacaoRecursos(); i++) {%>
        <img class="no-margin" src="images/star.png" title="star" width="1%">
      <% } %>
    </li>
    </ul>
    <li><b>Manuten��o</b></li>
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
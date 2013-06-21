<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Valores Padr�o</title>
</head>
<body>
  <h2>Valores Padr�o em vigor:</h2>
  <ul>
    <li>N�mero de Coment�rios: ${Vp.nComentariosM}</li>
    <li>Linhas de C�digo: ${Vp.nLinhasM}</li>
    <li>N�mero de Fun��es: ${Vp.nFuncoesM}</li>
    <li>N�mero de Erros: ${Vp.nErrosM}</li>
    <li>Tempo demorado: ${Vp.nTempoM}</li>
    <li>Complexidade Ciclom�tica de McCabe: ${Vp.nCCMcCabeM}</li>
    <li>M�tricas de Halstead: ${Vp.nHalsteadM}</li>
  </ul>
<%@ include file="footer.html"%>
</body>
</html>
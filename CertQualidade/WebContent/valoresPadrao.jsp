<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Valores Padrão</title>
</head>
<body>
  <h2>Valores Padrão em vigor:</h2>
  <ul>
    <li>Número de Comentários: ${Vp.nComentariosM}</li>
    <li>Linhas de Código: ${Vp.nLinhasM}</li>
    <li>Número de Funções: ${Vp.nFuncoesM}</li>
    <li>Número de Erros: ${Vp.nErrosM}</li>
    <li>Tempo demorado: ${Vp.nTempoM}</li>
    <li>Complexidade Ciclomática de McCabe: ${Vp.nCCMcCabeM}</li>
    <li>Métricas de Halstead: ${Vp.nHalsteadM}</li>
  </ul>
<%@ include file="footer.html"%>
</body>
</html>
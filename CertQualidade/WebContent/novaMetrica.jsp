<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nova Métrica</title>
</head>
<body>

<h3>Insira os novos valores das seguintes métricas:</h3>
  <form method="POST" action="http:NovaMetricaAction" name="metrica">
    <table>
      <tr>
        <td>Peso dos Comentários: </td>
        <td><input type="text" name="pesoComent" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoComentarios}</td>
      </tr>
      <tr>
        <td>Peso do Número de Linhas: </td>
        <td><input type="text" name="pesoLinhas" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoLinhas}</td>
      </tr>
      <tr>
        <td>Peso das Funções: </td>
        <td><input type="text" name="pesoFuncoes" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoFuncoes}</td>
      </tr>
      <tr>
        <td>Peso dos Erros: </td>
        <td><input type="text" name="pesoErros" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoErros}</td>
      </tr>
      <tr>
        <td>Peso do Tempo: </td>
        <td><input type="text" name="pesoTempo" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoTempo}</td>
      </tr>
      <tr>
        <td>Peso da Complexidade Ciclomática McCabe: </td>
        <td><input type="text" name="pesoCCMcCabe" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoCCMcCabe}</td>
      </tr>
      <tr>
        <td>Peso das métricas de Halstead: </td>
        <td><input type="text" name="pesoHalstead" size="11" maxlength="11"/></td>
        <td>Peso Atual: ${metricaAtual.pesoHalstead}</td>
      </tr>
    </table>
    <p>
      <input type="submit" name="NovaMetrica" value="Submeter">
    </p>
  </form>
<%@ include file="footer.html"%>
</body>
</html>

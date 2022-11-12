<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Medicamentos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Medicamentos: ${listagem.size()}</h3>
		<h4><a href="/medicamento">Novo medicamento</a></h4>
		<table class="table">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Código</th>
		        <th>Nome</th>
		        <th>Valor</th>
		        <th>Fabricação</th>
		        <th>Validade</th>
		        <th>Controlado</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="m" items="${listagem}">
			      <tr>
			      	<td>${m.id}</td>
			        <td>${m.codigo}</td>
			        <td>${m.nome}</td>
			        <td>${m.valor}</td>
			        <td>${m.fabricacao}</td>
			        <td>${m.validade}</td>
			        <td>${m.controlado}</td>
			        <td><a href="/medicamento/${m.id}/excluir">excluir</a></td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
	</div>
</body>
</html>
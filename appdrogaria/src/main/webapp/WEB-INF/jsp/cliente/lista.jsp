<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>
		<h4><a href="/cliente">Novo cliente</a></h4>
		<table class="table">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Nome</th>
		        <th>CPF</th>
		        <th>E-mail</th>
		        <th>Telefone</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="cl" items="${listagem}">
			      <tr>
			      	<td>${cl.id}</td>
			        <td>${cl.nome}</td>
			        <td>${cl.cpf}</td>
			        <td>${cl.email}</td>
			        <td>${cl.telefone}</td>
			        <td><a href="/cliente/${cl.id}/excluir">excluir</a></td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
	</div>
</body>
</html>
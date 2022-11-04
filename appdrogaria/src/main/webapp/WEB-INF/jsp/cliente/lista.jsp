<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Clientes</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-success navbar-dark">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/pedido/lista">Pedido</a></li>
				<li class="nav-item"><a class="nav-link active" href="/produto/lista">Produto</a></li>
				<li class="nav-item"><a class="nav-link active" href="/medicamento/lista">Medicamento</a></li>
				<li class="nav-item"><a class="nav-link active" href="/beleza/lista">Beleza</a></li>
				<li class="nav-item"><a class="nav-link active" href="/higiene/lista">Higiene</a></li>
				<li class="nav-item"><a class="nav-link active" href="/cliente/lista">Cliente</a></li>
			</ul>
		</div>
	</nav>
	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>
		
		<table class="table">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>CPF</th>
		        <th>E-mail</th>
		        <th>Telefone</th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="cl" items="${listagem}">
			      <tr>
			        <td>${cl.nome}</td>
			        <td>${cl.cpf}</td>
			        <td>${cl.email}</td>
			        <td>${cl.telefone}</td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
	</div>
	
</body>
</html>
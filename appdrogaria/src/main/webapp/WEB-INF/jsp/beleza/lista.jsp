<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Produtos de Beleza</title>
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
		<h3>Produtos de Beleza: ${listagem.size()}</h3>
		
		<table class="table">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Código</th>
		        <th>Nome</th>
		        <th>Valor</th>
		        <th>Marca</th>
		        <th>Fabricante</th>
		        <th>Peso</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="b" items="${listagem}">
			      <tr>
			      	<td>${b.id}</td>
			        <td>${b.codigo}</td>
			        <td>${b.nome}</td>
			        <td>${b.valor}</td>
			        <td>${b.marca}</td>
			        <td>${b.fabricante}</td>
			        <td>${b.peso}</td>
			        <td><a href="/beleza/${b.id}/excluir">excluir</a></td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
	</div>
</body>
</html>
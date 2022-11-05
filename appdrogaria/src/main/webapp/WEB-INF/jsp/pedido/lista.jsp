<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Pedidos</title>
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
		<h3>Pedidos: ${listagem.size()}</h3>
		
		<table class="table">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Descrição</th>
		        <th>Data</th>
		        <th>Mobile</th>
		        <th>Cliente</th>
		        <th>Produtos</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="p" items="${listagem}">
			      <tr>
			      	<td>${p.id}</td>
			        <td>${p.descricao}</td>
			        <td>${p.data}</td>
			        <td>${p.mobile}</td>
			        <td>${p.cliente}</td>
			        <td>${p.produtos.size()}</td>
			        <td><a href="/pedido/${p.id}/excluir">excluir</a></td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
	</div>
</body>
</html>
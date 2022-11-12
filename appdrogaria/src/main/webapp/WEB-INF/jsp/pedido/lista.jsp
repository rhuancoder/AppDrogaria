<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Pedidos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Pedidos: ${listagem.size()}</h3>
		<h4><a href="/pedido">Novo pedido</a></h4>
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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Produtos de Higiene</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Produtos de Higiene: ${listagem.size()}</h3>
		<h4><a href="/higiene">Novo produto de higiene</a></h4>
		<table class="table">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Código</th>
		        <th>Nome</th>
		        <th>Valor</th>
		        <th>Lote</th>
		        <th>Formato</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="h" items="${listagem}">
			      <tr>
			      	<td>${h.id}</td>
			        <td>${h.codigo}</td>
			        <td>${h.nome}</td>
			        <td>${h.valor}</td>
			        <td>${h.lote}</td>
			        <td>${h.formato}</td>
			        <td><a href="/higiene/${h.id}/excluir">excluir</a></td>
			      </tr>
		      	</c:forEach>
		    </tbody>
  		</table>
</body>
</html>
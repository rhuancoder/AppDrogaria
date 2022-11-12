<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Produtos de Beleza</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Produtos de Beleza: ${listagem.size()}</h3>
		<h4><a href="/beleza">Novo produto de beleza</a></h4>
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
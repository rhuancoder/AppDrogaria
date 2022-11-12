<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Cliente</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Cliente</h2>
		<form action="/cliente/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
			</div>
			<div class="form-group">
				<label>E-mail:</label> <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
			</div>
			<div class="form-group">
				<label>CPF:</label> <input type="text" class="form-control" placeholder="Entre com o seu CPF" name="cpf">
			</div>
			<div class="form-group">
				<label>Telefone:</label> <input type="text" class="form-control" placeholder="Entre com o seu telefone" name="telefone">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
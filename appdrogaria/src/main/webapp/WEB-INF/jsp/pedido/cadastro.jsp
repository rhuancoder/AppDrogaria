<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Pedido</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Pedido</h2>
		<form action="/pedido/incluir" method="post">
			<div class="form-group">
				<label>Descrição:</label> <input type="text" class="form-control" placeholder="Entre com a descrição" name="descricao">
			</div>
			<div class="form-group">
				<label>Mobile:</label> <input type="checkbox" class="form-control" name="mobile">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
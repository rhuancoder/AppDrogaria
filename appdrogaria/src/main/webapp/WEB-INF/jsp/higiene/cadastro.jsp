<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Produto de Higiene</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Produto de Higiene</h2>
		<form action="/higiene/incluir" method="post">
		    <c:import url="/WEB-INF/jsp/produto/cadastroparcial.jsp"/>
			<div class="form-group">
				<label>Lote:</label> <input type="text" class="form-control" placeholder="Entre com o lote" name="lote">
			</div>
			<div class="form-group">
				<label>Formato:</label> <input type="text" class="form-control" placeholder="Entre com o formato" name="formato">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
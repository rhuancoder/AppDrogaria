<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Medicamento</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Medicamento</h2>
		<form action="/medicamento/incluir" method="post">
		    <c:import url="/WEB-INF/jsp/produto/cadastroparcial.jsp"/>
			<div class="form-group">
				<label>Validade:</label> <input type="text" class="form-control" placeholder="Entre com a validade no formato DD/MM/AAAA" name="validade">
			</div>
			<div class="form-group">
				<label>Fabricação:</label> <input type="text" class="form-control" placeholder="Entre com a fabricação no formato DD/MM/AAAA" name="fabricacao">
			</div>
			<div class="form-group">
		      <label>Tipo:</label>
				<div class="form-check">
				  <input type="radio" class="form-check-input" name="controlado" value="false"> Livre
				  <label class="form-check-label"></label>
				</div>
				<div class="form-check">
				  <input type="radio" class="form-check-input" name="controlado" value="true"> Controlado
				  <label class="form-check-label"></label>
				</div>
	    	</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>
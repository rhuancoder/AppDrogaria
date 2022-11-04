<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Produtos</title>
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
		<h3>Produtos: ${listagem}</h3>
		<h3>${listagem.size()}</h3>
	</div>
</body>
</html>
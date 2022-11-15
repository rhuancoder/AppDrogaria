<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-toggleable-md navbar-light bg-color" style="background-color: paleturquoise;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">AppDrogaria</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
	  <c:if test="${not empty user}">
	      <li class="nav-item"><a class="nav-link active" href="/usuario/lista">Usuário</a></li>
	      <li class="nav-item"><a class="nav-link active" href="/pedido/lista">Pedido</a></li>
		  <li class="nav-item"><a class="nav-link active" href="/cliente/lista">Cliente</a></li>
		  <li class="nav-item"><a class="nav-link active" href="/produto/lista">Produto</a></li>
		  <li class="nav-item"><a class="nav-link active" href="/medicamento/lista">Medicamento</a></li>
	  	  <li class="nav-item"><a class="nav-link active" href="/beleza/lista">Beleza</a></li>
		  <li class="nav-item"><a class="nav-link active" href="/higiene/lista">Higiene</a></li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty user}">
	      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>      
	      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
      <c:if test="${not empty user}">
      	  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
      </c:if>
    </ul>
  </div>
</nav>
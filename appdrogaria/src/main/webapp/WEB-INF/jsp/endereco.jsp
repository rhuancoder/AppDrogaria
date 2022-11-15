<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="form-group">
	<label>CEP:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu CEP" value="${endereco.cep}" name="endereco.cep">
</div>
<div class="form-group">
	<label>Logradouro:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu logradouro" value="${endereco.logradouro}" name="endereco.logradouro">
</div>
<div class="form-group">
	<label>Complemento:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu complemento" value="${endereco.complemento}" name="endereco.complemento">
</div>
<div class="form-group">
	<label>Bairro:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu bairro" value="${endereco.bairro}" name="endereco.bairro">
</div>
<div class="form-group">
	<label>Localidade:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu localidade" value="${endereco.localidade}" name="endereco.localidade">
</div>
<div class="form-group">
	<label>UF:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu uf" value="${endereco.uf}" name="endereco.uf">
</div>
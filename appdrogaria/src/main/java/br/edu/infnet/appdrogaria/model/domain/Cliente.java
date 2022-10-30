package br.edu.infnet.appdrogaria.model.domain;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	private String telefone;

	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email + ";" + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

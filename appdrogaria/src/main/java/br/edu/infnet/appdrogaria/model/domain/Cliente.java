package br.edu.infnet.appdrogaria.model.domain;

public class Cliente {
	public String nome;
	public String cpf;
	public String email;
	public String telefone;

	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email + ";" + telefone;
	}
}

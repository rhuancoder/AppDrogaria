package br.edu.infnet.appdrogaria.model.domain;

public class Produto {
	public long codigo;
	public String nome;
	public double valor;

	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + valor;
	}
}
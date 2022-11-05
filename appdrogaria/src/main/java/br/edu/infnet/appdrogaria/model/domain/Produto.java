package br.edu.infnet.appdrogaria.model.domain;

public abstract class Produto {
	private Integer id;
	private long codigo;
	private String nome;
	private double valor;
	
	@Override
	public String toString() {
		return id + ";" + codigo + ";" + nome + ";" + valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
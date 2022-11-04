package br.edu.infnet.appdrogaria.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean mobile;
	private Cliente cliente;
	private List<Produto> produtos;

	public Pedido() {
		data = LocalDateTime.now();
		mobile = true;
	}
	
	public Pedido(Cliente cliente) {
		this();
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + mobile + ";" + cliente + ";" + produtos.size();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}

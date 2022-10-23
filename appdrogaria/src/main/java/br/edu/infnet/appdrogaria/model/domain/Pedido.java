package br.edu.infnet.appdrogaria.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	public String descricao;
	public LocalDateTime data;

	@Override
	public String toString() {
		return descricao + ";" + data;
	}
}

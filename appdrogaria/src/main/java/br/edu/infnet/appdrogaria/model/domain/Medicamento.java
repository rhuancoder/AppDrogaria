package br.edu.infnet.appdrogaria.model.domain;

import java.time.LocalDateTime;

public class Medicamento extends Produto {
	private LocalDateTime fabricacao;
	private LocalDateTime validade;
	private boolean controlado;
	
	@Override
	public String toString() {
		return super.toString() + ";" + fabricacao + ";" + validade + ";" + controlado;
	}

	public LocalDateTime getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(LocalDateTime fabricacao) {
		this.fabricacao = fabricacao;
	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

	public boolean isControlado() {
		return controlado;
	}

	public void setControlado(boolean controlado) {
		this.controlado = controlado;
	}
}

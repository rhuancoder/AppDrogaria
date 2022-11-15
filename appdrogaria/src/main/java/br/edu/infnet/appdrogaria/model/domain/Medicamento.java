package br.edu.infnet.appdrogaria.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tmedicamento")
public class Medicamento extends Produto {
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate fabricacao;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate validade;
	private boolean controlado;
	
	@Override
	public String toString() {
		return super.toString() + ";" + fabricacao + ";" + validade + ";" + controlado;
	}

	public LocalDate getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(LocalDate fabricacao) {
		this.fabricacao = fabricacao;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public boolean isControlado() {
		return controlado;
	}

	public void setControlado(boolean controlado) {
		this.controlado = controlado;
	}
}

package br.edu.infnet.appdrogaria.model.domain;

import java.time.LocalDateTime;

public class Medicamento extends Produto {
	public LocalDateTime fabricacao;
	public LocalDateTime validade;
	public boolean controlado;
	
	@Override
	public String toString() {
		return fabricacao + ";" + validade + ";" + controlado;
	}
}

package br.edu.infnet.appdrogaria.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "thigiene")
public class Higiene extends Produto {
	private String lote;
	private String formato;
	
	@Override
	public String toString() {
		return super.toString() + ";" + lote + ";" + formato;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
}

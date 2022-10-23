package br.edu.infnet.appdrogaria.model.domain;

public class Higiene extends Produto {
	public String lote;
	public String formato;
	
	@Override
	public String toString() {
		return lote + ";" + formato;
	}
}

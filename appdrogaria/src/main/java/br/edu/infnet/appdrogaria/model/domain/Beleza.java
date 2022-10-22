package br.edu.infnet.appdrogaria.model.domain;

public class Beleza extends Produto {
	public String marca;
	public String fabricante;
	public double peso;
	
	@Override
	public String toString() {
		return marca + ";" + fabricante + ";" + peso;
	}
}

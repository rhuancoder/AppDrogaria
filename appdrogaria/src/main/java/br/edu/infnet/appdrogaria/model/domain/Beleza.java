package br.edu.infnet.appdrogaria.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbeleza")
public class Beleza extends Produto {
	private String marca;
	private String fabricante;
	private double peso;
	
	@Override
	public String toString() {
		return super.toString() + ";" + marca + ";" + fabricante + ";" + peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}

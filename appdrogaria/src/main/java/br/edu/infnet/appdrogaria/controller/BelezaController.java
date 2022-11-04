package br.edu.infnet.appdrogaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdrogaria.model.domain.Beleza;

@Controller
public class BelezaController {

	@GetMapping(value = "/beleza/lista")
	public String telaLista(Model model) {
		
		Beleza b1 = new Beleza();
		b1.setCodigo(123457); 
		b1.setNome("Esmalte");
		b1.setValor(10.50);
		b1.setMarca("Colorama");
		b1.setFabricante("Loreal");
		b1.setPeso(0.0390);

		Beleza b2 = new Beleza();
		b2.setCodigo(157378); 
		b2.setNome("Tintura capilar");
		b2.setValor(28.99);
		b2.setMarca("Casting Creme Gloss");
		b2.setFabricante("Loreal");
		b2.setPeso(0.0580);

		Beleza b3 = new Beleza();
		b3.setCodigo(958473); 
		b3.setNome("Maquiagem");
		b3.setValor(19.99);
		b3.setMarca("Vult");
		b3.setFabricante("Vult");
		b3.setPeso(0.0350);
		
		List<Beleza> belezas = new ArrayList<Beleza>();
		belezas.add(b1);
		belezas.add(b2);
		belezas.add(b3);
		
		model.addAttribute("listagem", belezas);
		
		return "beleza/lista";
	}
}

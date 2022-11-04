package br.edu.infnet.appdrogaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Higiene;

@Controller
public class HigieneController {

	@GetMapping(value = "/higiene/lista")
	public String telaLista(Model model) {
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");

		Higiene h2 = new Higiene();
		h2.setCodigo(849873); 
		h2.setNome("Sabonete");
		h2.setValor(18.99);
		h2.setLote("98765");
		h2.setFormato("Liquido");

		Higiene h3 = new Higiene();
		h3.setCodigo(647632); 
		h3.setNome("Enxaguante bucal");
		h3.setValor(15.90);
		h3.setLote("75830");
		h3.setFormato("Liquido");
		
		List<Higiene> higienes = new ArrayList<Higiene>();
		higienes.add(h1);
		higienes.add(h2);
		higienes.add(h3);
		
		model.addAttribute("listagem", higienes);
		
		return "higiene/lista";
	}
}

package br.edu.infnet.appdrogaria.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.domain.Produto;

@Controller
public class ProdutoController {

	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		Beleza b1 = new Beleza();
		b1.setCodigo(123457); 
		b1.setNome("Esmalte");
		b1.setValor(10.50);
		b1.setMarca("Colorama");
		b1.setFabricante("Loreal");
		b1.setPeso(0.0390);
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDateTime.now());
		m1.setValidade(LocalDateTime.now().plusYears(1));
		m1.setControlado(false);
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(b1);
		produtos.add(m1);
		produtos.add(h1);
		
		model.addAttribute("listagem", produtos);
		
		return "produto/lista";
	}
}

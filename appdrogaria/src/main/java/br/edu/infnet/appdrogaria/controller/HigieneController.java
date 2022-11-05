package br.edu.infnet.appdrogaria.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.domain.Higiene;

@Controller
public class HigieneController {

	private static Map<Integer, Higiene> mapa = new HashMap<Integer, Higiene>();
	private static Integer id = 1;
	
	public static void incluir(Higiene higiene) {
		higiene.setId(id++);
		mapa.put(higiene.getId(), higiene);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Higiene> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/higiene/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		
		return "higiene/lista";
	}
	
	@GetMapping(value = "/higiene/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/higiene/lista";
	}
}

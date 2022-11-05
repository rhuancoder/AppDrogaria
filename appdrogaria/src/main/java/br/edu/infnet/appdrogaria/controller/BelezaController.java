package br.edu.infnet.appdrogaria.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.domain.Beleza;

@Controller
public class BelezaController {

	private static Map<Integer, Beleza> mapa = new HashMap<Integer, Beleza>();
	private static Integer id = 1;
	
	public static void incluir(Beleza beleza) {
		beleza.setId(id++);
		mapa.put(beleza.getId(), beleza);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Beleza> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/beleza/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		
		return "beleza/lista";
	}
	
	@GetMapping(value = "/beleza/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/beleza/lista";
	}
}

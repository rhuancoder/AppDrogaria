package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.service.BelezaService;

@Controller
public class BelezaController {

	@Autowired
	private BelezaService belezaService;
	
	@GetMapping(value = "/beleza/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", belezaService.obterLista());
		
		return "beleza/lista";
	}
	
	@GetMapping(value = "/beleza/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		belezaService.excluir(id);
		
		return "redirect:/beleza/lista";
	}
}

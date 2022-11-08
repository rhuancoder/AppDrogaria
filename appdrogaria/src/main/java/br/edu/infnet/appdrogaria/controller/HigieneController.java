package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.service.HigieneService;

@Controller
public class HigieneController {

	@Autowired
	private HigieneService higieneService;
	
	@GetMapping(value = "/higiene/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", higieneService.obterLista());
		
		return "higiene/lista";
	}
	
	@GetMapping(value = "/higiene/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		higieneService.excluir(id);
		
		return "redirect:/higiene/lista";
	}
}

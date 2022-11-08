package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.service.MedicamentoService;

@Controller
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;
	
	@GetMapping(value = "/medicamento/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", medicamentoService.obterLista());
		
		return "medicamento/lista";
	}
	
	@GetMapping(value = "/medicamento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		medicamentoService.excluir(id);
		
		return "redirect:/medicamento/lista";
	}
}

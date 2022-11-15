package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
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
	
	@GetMapping(value = "/higiene")
	public String telaCadastro() {
		return "higiene/cadastro";
	}

	@PostMapping(value = "/higiene/incluir")
	public String incluir(Higiene higiene, @SessionAttribute("user") Usuario usuario) {
		higiene.setUsuario(usuario);
		higieneService.incluir(higiene);

		return "redirect:/higiene/lista";
	}
	
	@GetMapping(value = "/higiene/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		higieneService.excluir(id);
		
		return "redirect:/higiene/lista";
	}
}

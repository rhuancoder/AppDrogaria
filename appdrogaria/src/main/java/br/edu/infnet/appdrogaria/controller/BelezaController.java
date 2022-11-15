package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
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
	
	@GetMapping(value = "/beleza")
	public String telaCadastro() {
		return "beleza/cadastro";
	}

	@PostMapping(value = "/beleza/incluir")
	public String incluir(Beleza beleza, @SessionAttribute("user") Usuario usuario) {
		beleza.setUsuario(usuario);
		belezaService.incluir(beleza);

		return "redirect:/beleza/lista";
	}
	
	@GetMapping(value = "/beleza/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		belezaService.excluir(id);
		
		return "redirect:/beleza/lista";
	}
}

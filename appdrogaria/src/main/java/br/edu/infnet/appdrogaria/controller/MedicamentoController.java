package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
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
	
	@GetMapping(value = "/medicamento")
	public String telaCadastro() {
		return "medicamento/cadastro";
	}

	@PostMapping(value = "/medicamento/incluir")
	public String incluir(Medicamento medicamento, @SessionAttribute("user") Usuario usuario) {
		medicamento.setUsuario(usuario);
		medicamentoService.incluir(medicamento);

		return "redirect:/medicamento/lista";
	}
	
	@GetMapping(value = "/medicamento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		medicamentoService.excluir(id);
		
		return "redirect:/medicamento/lista";
	}
}

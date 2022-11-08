package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdrogaria.model.service.PedidoService;

@Controller
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", pedidoService.obterLista());
		
		return "pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		pedidoService.excluir(id);
		
		return "redirect:/pedido/lista";
	}
}

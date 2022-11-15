package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdrogaria.model.domain.Pedido;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.ClienteService;
import br.edu.infnet.appdrogaria.model.service.PedidoService;
import br.edu.infnet.appdrogaria.model.service.ProdutoService;

@Controller
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pedidoService.obterLista(usuario));
		
		return "pedido/lista";
	}
	
	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		 model.addAttribute("produtos", produtoService.obterLista(usuario));
	     model.addAttribute("clientes", clienteService.obterLista(usuario));
		
		return "pedido/cadastro";
	}

	@PostMapping(value = "/pedido/incluir")
	public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {
		pedido.setUsuario(usuario);
		pedidoService.incluir(pedido);

		return "redirect:/pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		pedidoService.excluir(id);
		
		return "redirect:/pedido/lista";
	}
}

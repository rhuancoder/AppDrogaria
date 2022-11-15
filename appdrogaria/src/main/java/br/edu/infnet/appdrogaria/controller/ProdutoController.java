package br.edu.infnet.appdrogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdrogaria.model.domain.Produto;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", produtoService.obterLista());
		
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto")
	public String telaCadastro() {
		return "produto/cadastro";
	}

	@PostMapping(value = "/produto/incluir")
	public String incluir(Produto produto, @SessionAttribute("user") Usuario usuario) {
		produto.setUsuario(usuario);
		produtoService.incluir(produto);

		return "redirect:/produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		produtoService.excluir(id);
		
		return "redirect:/produto/lista";
	}
}

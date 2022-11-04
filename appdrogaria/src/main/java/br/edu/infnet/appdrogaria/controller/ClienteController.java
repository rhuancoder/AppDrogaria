package br.edu.infnet.appdrogaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Cliente;

@Controller
public class ClienteController {

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Bruce Wayne");
		c1.setCpf("12345678901");
		c1.setEmail("bruce.wayne@dccomics.com");
		c1.setTelefone("41999999999");

		Cliente c2 = new Cliente();
		c2.setNome("Oliver Queen");
		c2.setCpf("12345678902");
		c2.setEmail("oliver.queen@dccomics.com");
		c2.setTelefone("41988888888");
		
		Cliente c3 = new Cliente();
		c3.setNome("Clark Kent");
		c3.setCpf("12345678903");
		c3.setEmail("clark.kent@dccomics.com");
		c3.setTelefone("41987777777");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		model.addAttribute("listagem", clientes);
		
		return "cliente/lista";
	}
}

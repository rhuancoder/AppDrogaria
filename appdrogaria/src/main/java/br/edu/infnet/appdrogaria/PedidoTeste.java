package br.edu.infnet.appdrogaria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.domain.Pedido;
import br.edu.infnet.appdrogaria.model.domain.Produto;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.PedidoService;

@Order(7)
@Component
public class PedidoTeste implements ApplicationRunner {

	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("### Cadastro de Pedidos ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Beleza b1 = new Beleza();
		b1.setId(1);
		
		Higiene h1 = new Higiene();
		h1.setId(1);
		
		Medicamento m1 = new Medicamento();
		m1.setId(1);
		
		Cliente c1 = new Cliente();
		c1.setId(1);
		
		List<Produto> produtosPedidoUm = new ArrayList<Produto>();
		produtosPedidoUm.add(h1);
		produtosPedidoUm.add(m1);
		
		List<Produto> produtosDemaisPedidos = new ArrayList<Produto>();
		produtosDemaisPedidos.add(h1);
		produtosDemaisPedidos.add(m1);
		produtosDemaisPedidos.add(b1);
		
		Pedido p1 = new Pedido(c1);
		p1.setDescricao("Pedido um");
		p1.setMobile(false);
		p1.setProdutos(produtosPedidoUm);
		p1.setUsuario(usuario);
		System.out.println("Pedido - " + p1);
		pedidoService.incluir(p1);

		Pedido p2 = new Pedido(c1);
		p2.setDescricao("Pedido dois");
		p2.setMobile(true);
		p2.setProdutos(produtosDemaisPedidos);
		p2.setUsuario(usuario);
		System.out.println("Pedido - " + p2);
		pedidoService.incluir(p2);
		
		Cliente c2 = new Cliente();
		c2.setId(2);

		Pedido p3 = new Pedido(c2);
		p3.setDescricao("Pedido tres");
		p3.setProdutos(produtosDemaisPedidos);
		p3.setUsuario(usuario);
		System.out.println("Pedido - " + p3);
		pedidoService.incluir(p3);
	}
}
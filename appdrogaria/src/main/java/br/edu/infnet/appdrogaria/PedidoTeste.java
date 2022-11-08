package br.edu.infnet.appdrogaria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.domain.Pedido;
import br.edu.infnet.appdrogaria.model.domain.Produto;
import br.edu.infnet.appdrogaria.model.service.PedidoService;

@Component
public class PedidoTeste implements ApplicationRunner {

	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("### Cadastro de Pedidos ###");
		
		Beleza b1 = new Beleza();
		b1.setCodigo(123457); 
		b1.setNome("Esmalte");
		b1.setValor(10.50);
		b1.setMarca("Colorama");
		b1.setFabricante("Loreal");
		b1.setPeso(0.0390);
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDateTime.now());
		m1.setValidade(LocalDateTime.now().plusYears(1));
		m1.setControlado(false);
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");
		
		Cliente c1 = new Cliente();
		c1.setNome("Bruce Wayne");
		c1.setCpf("12345678901");
		c1.setEmail("bruce.wayne@dccomics.com");
		c1.setTelefone("41999999999");
		
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
		System.out.println("Pedido - " + p1);
		pedidoService.incluir(p1);

		Pedido p2 = new Pedido(c1);
		p2.setDescricao("Pedido dois");
		p2.setMobile(true);
		p2.setProdutos(produtosDemaisPedidos);
		System.out.println("Pedido - " + p2);
		pedidoService.incluir(p2);
		
		Cliente c2 = new Cliente();
		c2.setNome("Oliver Queen");
		c2.setCpf("12345678902");
		c2.setEmail("oliver.queen@dccomics.com");
		c2.setTelefone("41988888888");

		Pedido p3 = new Pedido(c2);
		p3.setDescricao("Pedido tres");
		p3.setProdutos(produtosDemaisPedidos);
		System.out.println("Pedido - " + p3);
		pedidoService.incluir(p3);
	}
}
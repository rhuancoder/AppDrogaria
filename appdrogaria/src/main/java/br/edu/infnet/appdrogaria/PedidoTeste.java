package br.edu.infnet.appdrogaria;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Pedido;

@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("### Cadastro de Pedidos ###");
		
		Pedido p1 = new Pedido();		
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Pedido um");
		System.out.println("Pedido - " + p1);

		Pedido p2 = new Pedido();
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Pedido dois");
		System.out.println("Pedido - " + p2);

		Pedido p3 = new Pedido();
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Pedido tres");
		System.out.println("Pedido - " + p3);
	}
}
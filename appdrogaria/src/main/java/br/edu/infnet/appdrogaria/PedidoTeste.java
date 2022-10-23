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

		Pedido p1 = new Pedido();		
		p1.data = LocalDateTime.now();
		p1.descricao = "Pedido um";
		System.out.println("Pedido - " + p1);

		Pedido p2 = new Pedido();
		p2.data = LocalDateTime.now();
		p2.descricao = "Pedido dois";
		System.out.println("Pedido - " + p2);

		Pedido p3 = new Pedido();
		p3.data = LocalDateTime.now();
		p3.descricao = "Pedido tres";
		System.out.println("Pedido - " + p3);
	}
}
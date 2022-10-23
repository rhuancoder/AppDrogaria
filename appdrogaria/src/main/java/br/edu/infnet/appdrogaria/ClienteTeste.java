package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Cliente c1 = new Cliente();
		c1.nome = "Bruce Wayne";
		c1.cpf = "12345678901";
		c1.email = "bruce.wayne@dccomics.com";
		c1.telefone = "41999999999";
		System.out.println("Cliente - " + c1);

		Cliente c2 = new Cliente();
		c2.nome = "Oliver Queen";
		c2.cpf = "12345678902";
		c2.email = "oliver.queen@dccomics.com";
		c2.telefone = "41988888888";
		System.out.println("Cliente - " + c2);

		Cliente c3 = new Cliente();
		c3.nome = "Clark Kent";
		c3.cpf = "12345678903";
		c3.email = "clark.kent@dccomics.com";
		c3.telefone = "41987777777";
		System.out.println("Cliente - " + c3);
	}
}

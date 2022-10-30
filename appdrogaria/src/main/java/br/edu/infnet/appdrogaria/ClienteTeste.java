package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de Clientes ###");
		
		Cliente c1 = new Cliente();
		c1.setNome("Bruce Wayne");
		c1.setCpf("12345678901");
		c1.setEmail("bruce.wayne@dccomics.com");
		c1.setTelefone("41999999999");
		System.out.println("Cliente - " + c1);

		Cliente c2 = new Cliente();
		c2.setNome("Oliver Queen");
		c2.setCpf("12345678902");
		c2.setEmail("oliver.queen@dccomics.com");
		c2.setTelefone("41988888888");
		System.out.println("Cliente - " + c2);

		Cliente c3 = new Cliente();
		c3.setNome("Clark Kent");
		c3.setCpf("12345678903");
		c3.setEmail("clark.kent@dccomics.com");
		c3.setTelefone("41987777777");
		System.out.println("Cliente - " + c3);
	}
}

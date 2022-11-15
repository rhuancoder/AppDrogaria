package br.edu.infnet.appdrogaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.ClienteService;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de Clientes ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente c1 = new Cliente();
		c1.setNome("Bruce Wayne");
		c1.setCpf("12345678901");
		c1.setEmail("bruce.wayne@dccomics.com");
		c1.setTelefone("41999999999");
		c1.setUsuario(usuario);
		System.out.println("Cliente - " + c1);
		clienteService.incluir(c1);

		Cliente c2 = new Cliente();
		c2.setNome("Oliver Queen");
		c2.setCpf("12345678902");
		c2.setEmail("oliver.queen@dccomics.com");
		c2.setTelefone("41988888888");
		c2.setUsuario(usuario);
		System.out.println("Cliente - " + c2);
		clienteService.incluir(c2);

		Cliente c3 = new Cliente();
		c3.setNome("Clark Kent");
		c3.setCpf("12345678903");
		c3.setEmail("clark.kent@dccomics.com");
		c3.setTelefone("41987777777");
		c3.setUsuario(usuario);
		System.out.println("Cliente - " + c3);
		clienteService.incluir(c3);
	}
}

package br.edu.infnet.appdrogaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.HigieneService;

@Order(6)
@Component
public class HigieneTeste implements ApplicationRunner {

	@Autowired
	private HigieneService higieneService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de produtos de Higiene ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");
		h1.setUsuario(usuario);
		System.out.println("Higiene - " + h1);
		higieneService.incluir(h1);

		Higiene h2 = new Higiene();
		h2.setCodigo(849873); 
		h2.setNome("Sabonete");
		h2.setValor(18.99);
		h2.setLote("98765");
		h2.setFormato("Liquido");
		h2.setUsuario(usuario);
		System.out.println("Higiene - " + h2);
		higieneService.incluir(h2);

		Higiene h3 = new Higiene();
		h3.setCodigo(647632); 
		h3.setNome("Enxaguante bucal");
		h3.setValor(15.90);
		h3.setLote("75830");
		h3.setFormato("Liquido");
		h3.setUsuario(usuario);
		System.out.println("Higiene - " + h3);
		higieneService.incluir(h3);
	}
}
package br.edu.infnet.appdrogaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.BelezaService;

@Order(4)
@Component
public class BelezaTeste implements ApplicationRunner {

	@Autowired
	private BelezaService belezaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de produtos de Beleza ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Beleza b1 = new Beleza();
		b1.setCodigo(123457); 
		b1.setNome("Esmalte");
		b1.setValor(10.50);
		b1.setMarca("Colorama");
		b1.setFabricante("Loreal");
		b1.setPeso(0.0390);
		b1.setUsuario(usuario);
		System.out.println("Beleza - " + b1);
		belezaService.incluir(b1);

		Beleza b2 = new Beleza();
		b2.setCodigo(157378); 
		b2.setNome("Tintura capilar");
		b2.setValor(28.99);
		b2.setMarca("Casting Creme Gloss");
		b2.setFabricante("Loreal");
		b2.setPeso(0.0580);
		b2.setUsuario(usuario);
		System.out.println("Beleza - " + b2);
		belezaService.incluir(b2);

		Beleza b3 = new Beleza();
		b3.setCodigo(958473); 
		b3.setNome("Maquiagem");
		b3.setValor(19.99);
		b3.setMarca("Vult");
		b3.setFabricante("Vult");
		b3.setPeso(0.0350);
		b3.setUsuario(usuario);
		System.out.println("Beleza - " + b3);
		belezaService.incluir(b3);
	}
}

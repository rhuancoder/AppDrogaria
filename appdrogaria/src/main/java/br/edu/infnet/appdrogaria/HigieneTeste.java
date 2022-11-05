package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.controller.ClienteController;
import br.edu.infnet.appdrogaria.controller.HigieneController;
import br.edu.infnet.appdrogaria.model.domain.Higiene;

@Component
public class HigieneTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de produtos de Higiene ###");
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");
		System.out.println("Higiene - " + h1);
		HigieneController.incluir(h1);

		Higiene h2 = new Higiene();
		h2.setCodigo(849873); 
		h2.setNome("Sabonete");
		h2.setValor(18.99);
		h2.setLote("98765");
		h2.setFormato("Liquido");
		System.out.println("Higiene - " + h2);
		HigieneController.incluir(h2);

		Higiene h3 = new Higiene();
		h3.setCodigo(647632); 
		h3.setNome("Enxaguante bucal");
		h3.setValor(15.90);
		h3.setLote("75830");
		h3.setFormato("Liquido");
		System.out.println("Higiene - " + h3);
		HigieneController.incluir(h3);
	}
}
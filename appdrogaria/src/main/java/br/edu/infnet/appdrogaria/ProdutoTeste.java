package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Produto;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Produto p1 = new Produto();		
		p1.codigo = 123456; 
		p1.nome = "Xarope";
		p1.valor = 30.90;
		System.out.println("Produto - " + p1);

		Produto p2 = new Produto();		
		p2.codigo = 123457; 
		p2.nome = "Tintura";
		p2.valor = 10.50;
		System.out.println("Produto - " + p2);

		Produto p3 = new Produto();		
		p3.codigo = 123458; 
		p3.nome = "Cotonete";
		p3.valor = 9.99;
		System.out.println("Produto - " + p3);
	}
}
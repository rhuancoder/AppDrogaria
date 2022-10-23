package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Higiene;

@Component
public class HigieneTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Higiene h1 = new Higiene();
		h1.lote = "123456";
		h1.formato = "Creme";
		System.out.println("Higiene - " + h1);

		Higiene h2 = new Higiene();
		h2.lote = "98765";
		h2.formato = "Gel";
		System.out.println("Higiene - " + h2);

		Higiene h3 = new Higiene();
		h3.lote = "75830";
		h3.formato = "Liquido";
		System.out.println("Higiene - " + h3);
	}
}
package br.edu.infnet.appdrogaria;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Beleza;

@Component
public class BelezaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Beleza b1 = new Beleza();
		b1.marca = "Colorama";
		b1.fabricante = "Loreal";
		b1.peso = 0.0390;
		System.out.println("Beleza - " + b1);

		Beleza b2 = new Beleza();
		b2.marca = "Risque";
		b2.fabricante = "Coty";
		b2.peso = 0.0580;
		System.out.println("Beleza - " + b2);

		Beleza b3 = new Beleza();
		b3.marca = "Impala";
		b3.fabricante = "Mundial";
		b3.peso = 0.0350;
		System.out.println("Beleza - " + b3);
	}
}

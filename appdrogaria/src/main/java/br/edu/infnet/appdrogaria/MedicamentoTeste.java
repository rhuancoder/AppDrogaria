package br.edu.infnet.appdrogaria;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Medicamento;

@Component
public class MedicamentoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Medicamento m1 = new Medicamento();
		m1.fabricacao = LocalDateTime.now();
		m1.validade = LocalDateTime.now().plusYears(1);
		m1.controlado = true;
		System.out.println("Medicamento - " + m1);

		Medicamento m2 = new Medicamento();
		m2.fabricacao = LocalDateTime.now();
		m2.validade = LocalDateTime.now().plusYears(1);
		m2.controlado = false;
		System.out.println("Medicamento - " + m2);

		Medicamento m3 = new Medicamento();
		m3.fabricacao = LocalDateTime.now();
		m3.validade = LocalDateTime.now().plusYears(1);
		m3.controlado = false;
		System.out.println("Medicamento - " + m3);
	}
}
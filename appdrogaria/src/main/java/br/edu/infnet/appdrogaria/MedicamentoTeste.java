package br.edu.infnet.appdrogaria;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.controller.HigieneController;
import br.edu.infnet.appdrogaria.controller.MedicamentoController;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;

@Component
public class MedicamentoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de Medicamentos ###");
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDateTime.now());
		m1.setValidade(LocalDateTime.now().plusYears(1));
		m1.setControlado(false);
		System.out.println("Medicamento - " + m1);
		MedicamentoController.incluir(m1);

		Medicamento m2 = new Medicamento();
		m2.setCodigo(79857); 
		m2.setNome("Reconter");
		m2.setValor(70.00);
		m2.setFabricacao(LocalDateTime.now());
		m2.setValidade(LocalDateTime.now().plusYears(1));
		m2.setControlado(true);
		System.out.println("Medicamento - " + m2);
		MedicamentoController.incluir(m2);

		Medicamento m3 = new Medicamento();
		m3.setCodigo(96869); 
		m3.setNome("Dorflex");
		m3.setValor(8.90);
		m3.setFabricacao(LocalDateTime.now());
		m3.setValidade(LocalDateTime.now().plusYears(1));
		m3.setControlado(false);
		System.out.println("Medicamento - " + m3);
		MedicamentoController.incluir(m3);
	}
}
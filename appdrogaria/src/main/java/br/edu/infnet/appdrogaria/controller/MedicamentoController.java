package br.edu.infnet.appdrogaria.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;

@Controller
public class MedicamentoController {

	@GetMapping(value = "/medicamento/lista")
	public String telaLista(Model model) {
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDateTime.now());
		m1.setValidade(LocalDateTime.now().plusYears(1));
		m1.setControlado(false);

		Medicamento m2 = new Medicamento();
		m2.setCodigo(79857); 
		m2.setNome("Reconter");
		m2.setValor(70.00);
		m2.setFabricacao(LocalDateTime.now());
		m2.setValidade(LocalDateTime.now().plusYears(1));
		m2.setControlado(true);

		Medicamento m3 = new Medicamento();
		m3.setCodigo(96869); 
		m3.setNome("Dorflex");
		m3.setValor(8.90);
		m3.setFabricacao(LocalDateTime.now());
		m3.setValidade(LocalDateTime.now().plusYears(1));
		m3.setControlado(false);
		
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		medicamentos.add(m1);
		medicamentos.add(m2);
		medicamentos.add(m3);
		
		model.addAttribute("listagem", medicamentos);
		
		return "medicamento/lista";
	}
}

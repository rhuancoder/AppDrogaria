package br.edu.infnet.appdrogaria;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.service.ProdutoService;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Autowired
	private ProdutoService produtoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de Produtos ###");
		
		Beleza b1 = new Beleza();
		b1.setCodigo(123457); 
		b1.setNome("Esmalte");
		b1.setValor(10.50);
		b1.setMarca("Colorama");
		b1.setFabricante("Loreal");
		b1.setPeso(0.0390);
		System.out.println("Beleza - " + b1);
		produtoService.incluir(b1);
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDateTime.now());
		m1.setValidade(LocalDateTime.now().plusYears(1));
		m1.setControlado(false);
		System.out.println("Medicamento - " + m1);
		produtoService.incluir(m1);
		
		Higiene h1 = new Higiene();
		h1.setCodigo(123458); 
		h1.setNome("Pasta de dente");
		h1.setValor(9.99);
		h1.setLote("123456");
		h1.setFormato("Creme");
		System.out.println("Higiene - " + h1);
		produtoService.incluir(h1);
	}
}
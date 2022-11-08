package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

	@Autowired
	private MedicamentoRepository medicamentoRepository;

	public void incluir(Medicamento medicamento) {
		medicamentoRepository.save(medicamento);
	}

	public void excluir(Integer id) {
		medicamentoRepository.deleteById(id);
	}

	public Collection<Medicamento> obterLista() {
		return (Collection<Medicamento>) medicamentoRepository.findAll();
	}
}

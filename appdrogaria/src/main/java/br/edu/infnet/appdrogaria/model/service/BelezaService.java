package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.model.domain.Beleza;
import br.edu.infnet.appdrogaria.model.repository.BelezaRepository;

@Service
public class BelezaService {

	@Autowired
	private BelezaRepository belezaRepository;

	public void incluir(Beleza beleza) {
		belezaRepository.save(beleza);
	}

	public void excluir(Integer id) {
		belezaRepository.deleteById(id);
	}

	public Collection<Beleza> obterLista() {
		return (Collection<Beleza>) belezaRepository.findAll();
	}
}

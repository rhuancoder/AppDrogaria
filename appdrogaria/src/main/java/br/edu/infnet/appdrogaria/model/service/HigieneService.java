package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.model.domain.Higiene;
import br.edu.infnet.appdrogaria.model.repository.HigieneRepository;

@Service
public class HigieneService {

	@Autowired
	private HigieneRepository higieneRepository;

	public void incluir(Higiene higiene) {
		higieneRepository.save(higiene);
	}

	public void excluir(Integer id) {
		higieneRepository.deleteById(id);
	}

	public Collection<Higiene> obterLista() {
		return (Collection<Higiene>) higieneRepository.findAll();
	}
}

package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.model.domain.Cliente;
import br.edu.infnet.appdrogaria.model.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

	public Collection<Cliente> obterLista() {
		return (Collection<Cliente>) clienteRepository.findAll();
	}
}

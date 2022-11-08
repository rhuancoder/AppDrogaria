package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.model.domain.Produto;
import br.edu.infnet.appdrogaria.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void incluir(Produto produto) {
		produtoRepository.save(produto);
	}

	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}

	public Collection<Produto> obterLista() {
		return (Collection<Produto>) produtoRepository.findAll();
	}
}

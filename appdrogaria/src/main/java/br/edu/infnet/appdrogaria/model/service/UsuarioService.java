package br.edu.infnet.appdrogaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.clients.IEnderecoClient;
import br.edu.infnet.appdrogaria.model.domain.Endereco;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IEnderecoClient enderecoClient;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);

		if (usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}

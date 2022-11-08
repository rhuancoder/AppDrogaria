package br.edu.infnet.appdrogaria.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdrogaria.model.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}

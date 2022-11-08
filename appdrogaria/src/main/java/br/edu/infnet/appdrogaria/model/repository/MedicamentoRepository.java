package br.edu.infnet.appdrogaria.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdrogaria.model.domain.Medicamento;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {

}

package br.edu.infnet.appdrogaria.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdrogaria.model.domain.Higiene;

@Repository
public interface HigieneRepository extends CrudRepository<Higiene, Integer> {

}

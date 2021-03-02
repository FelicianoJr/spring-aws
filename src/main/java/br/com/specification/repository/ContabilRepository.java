package br.com.specification.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.specification.model.Contabil;

@Repository
public interface ContabilRepository extends CrudRepository<Contabil, Long>, JpaSpecificationExecutor<Contabil>{

}

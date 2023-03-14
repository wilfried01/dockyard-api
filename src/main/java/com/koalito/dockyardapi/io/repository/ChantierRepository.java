package com.koalito.dockyardapi.io.repository;

import com.koalito.dockyardapi.io.entity.ChantierEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierRepository extends CrudRepository<ChantierEntity, Long> {

}

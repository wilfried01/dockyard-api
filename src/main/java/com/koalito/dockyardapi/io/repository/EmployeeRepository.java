package com.koalito.dockyardapi.io.repository;

import com.koalito.dockyardapi.io.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}

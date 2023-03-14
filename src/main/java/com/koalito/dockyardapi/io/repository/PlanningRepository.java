package com.koalito.dockyardapi.io.repository;

import com.koalito.dockyardapi.io.entity.PlanningEntity;
import com.koalito.dockyardapi.io.entity.PlanningKey;
import org.springframework.data.repository.CrudRepository;

public interface PlanningRepository extends CrudRepository<PlanningEntity, PlanningKey> {
}

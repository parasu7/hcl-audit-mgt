package com.sg.exp.repository;

import com.sg.exp.model.Audit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends CrudRepository<Audit, Integer> {

}

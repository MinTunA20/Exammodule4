package com.testmd4.repositories;

import com.testmd4.model.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranch extends CrudRepository<Branch,Integer> {
}

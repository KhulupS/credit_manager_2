package com.khulup.credit_manager.repository;

import com.khulup.credit_manager.entities.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends CrudRepository<Credit,Long> {
}

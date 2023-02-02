package com.khulup.credit_manager.repository;

import com.khulup.credit_manager.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {
}

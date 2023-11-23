package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {

}

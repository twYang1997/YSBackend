package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.ClientDetail;
import com.yessir.backend.model.ClientDetailId;

@Repository
public interface ClientDetailRepository extends CrudRepository<ClientDetail, ClientDetailId> {

}

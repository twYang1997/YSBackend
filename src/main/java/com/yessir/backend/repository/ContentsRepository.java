package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.Contents;

@Repository
public interface ContentsRepository extends CrudRepository<Contents, Long>  {

}

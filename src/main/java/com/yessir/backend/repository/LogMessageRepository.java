package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.LogMessage;

@Repository
public interface LogMessageRepository extends CrudRepository<LogMessage, Integer> {

}

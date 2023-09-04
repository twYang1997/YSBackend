package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

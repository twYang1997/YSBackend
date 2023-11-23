package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

}

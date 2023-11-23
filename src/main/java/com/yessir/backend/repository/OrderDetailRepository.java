package com.yessir.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yessir.backend.model.OrderDetail;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}

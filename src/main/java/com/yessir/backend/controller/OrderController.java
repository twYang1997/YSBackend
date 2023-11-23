package com.yessir.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yessir.backend.model.Order;
import com.yessir.backend.repository.OrderDetailRepository;
import com.yessir.backend.repository.OrderRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	private OrderRepository oRepository;
	
	@Autowired
	private OrderDetailRepository oDRepository;
	
	@GetMapping("/orders")
	public List<Order> getOrders() {
		return (List<Order>)oRepository.findAll();
	}
	
	@GetMapping("/order")
	public Order getOrder(@RequestParam String orderId) {
		Optional<Order> orderList = oRepository.findById(orderId);
		
		return orderList.get();
	}
}

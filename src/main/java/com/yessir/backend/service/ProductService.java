package com.yessir.backend.service;

import org.springframework.stereotype.Service;

import com.yessir.backend.model.Product;

@Service
public class ProductService {

	/**
	 * @param product
	 * 
	 * TODO: 1. setImageUrl 2. write into the project resource file
	 */
	public void setProductImage(Product product) {
		
		product.setImageUrl("testing...");
	}
	
	
}


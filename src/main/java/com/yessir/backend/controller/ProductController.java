package com.yessir.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yessir.backend.model.Product;
import com.yessir.backend.repository.ProductRepository;
import com.yessir.backend.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    
	@Autowired
    private ProductRepository pRepository;

	@Autowired
	private ProductService pService;
	
    @GetMapping("/products")
    public List<Product> getProducts() {
        return (List<Product>) pRepository.findAll();
    }

    @PostMapping("/products")
    void addProducts(@RequestBody Product product) {
    	
    	pService.setProductImage(product);
    	
    	pRepository.save(product);
    }
    
}

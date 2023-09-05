package com.yessir.backend.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Product")
public class Product {
    
    @Id
    private String no;
    
    private String imageUrl = "";
    
    private BigDecimal surfaceArea;
    
    private String status;
    
}
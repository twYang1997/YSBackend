package com.yessir.backend.model;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Product")
public class Product {
    
    @EmbeddedId
    private ProductId id;
    
    private String lastDate;
    
    private String imageUrl = "";
    
    private BigDecimal surfaceArea;
    
    private BigDecimal width;
    
    private BigDecimal height;
    
    private BigDecimal length;
    
    private BigDecimal weight;
    
    private BigDecimal boardPrice;
    
    private BigDecimal fixedPrice;
    
    private String status;
    
}
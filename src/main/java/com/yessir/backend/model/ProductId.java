package com.yessir.backend.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ProductId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String productId;
	
	private int seq;

}

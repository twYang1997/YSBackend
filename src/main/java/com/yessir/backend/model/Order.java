package com.yessir.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Order")
public class Order {
	
	@Id
	private String orderId;
	
	private String orderDate;
	
	private String dealerId;
	
	private String salesId;
	
	private String clientId;
	
	private String status;
	
	private Boolean exportFlg;
	
}

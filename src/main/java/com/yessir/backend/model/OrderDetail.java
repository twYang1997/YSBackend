package com.yessir.backend.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "OrderDetail")
public class OrderDetail {
	
	@EmbeddedId
	private OrderDetailId id;
	
	private String productId;
	
	private String cmsId;
	
	private String processingDate;
	
	private String buildDateS;
	
	private String buildDateE;
	
	private String fillDateS;
	
	private String fillDateE;
	
	private String qualifiedDateS;
	
	private String qualifiedDateE;
	
	private String exportDate;
	
}

package com.yessir.backend.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ClientDetail")
public class ClientDetail {

	@EmbeddedId
	private ClientDetailId id;
	
	private String branchName;
	
	private String country;
	
	private String city;
	
	private String town;
	
	private String address;
	
	private String dealer1;
	
	private String dealerPhone1;
	
	private String dealerEmail1;
	
	private String dealer2;
	
	private String dealerPhone2;
	
	private String dealerEmail2;
	
	private String status;
	
}

package com.yessir.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Client")
public class Client {
	
	@Id
	private String clientId;
	
	private String guiNumber;
	
	private String fullName;
	
	private String type;
	
	private Boolean ndaFlg;
	
	private String remark;
	
	private String status;

}

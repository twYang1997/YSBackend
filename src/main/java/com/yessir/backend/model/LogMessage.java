package com.yessir.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "LogMessage")
public class LogMessage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String mainPageCode;
	
	private String controllerAddress;
	
	private String simpleClass;
	
	private String method;
	
	private String args;
	
	private String logDate;
	
	private String logTime;
	
	private String status;
}

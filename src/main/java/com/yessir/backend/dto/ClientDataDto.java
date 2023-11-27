package com.yessir.backend.dto;

import com.yessir.backend.model.Client;
import com.yessir.backend.model.ClientDetail;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDataDto {
	
	public Client client;
	
	public ClientDetail[] clientDetails;
	
}

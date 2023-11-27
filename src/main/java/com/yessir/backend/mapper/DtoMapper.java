package com.yessir.backend.mapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yessir.backend.dto.ClientDataDto;
import com.yessir.backend.model.Client;
import com.yessir.backend.model.ClientDetail;

@Component
public class DtoMapper {

	public ClientDataDto toClientDataDto(Client client, ClientDetail[] clientDetails) {
		
		return new ClientDataDto(client, clientDetails);
		
	}
	
	public Client toClient(ClientDataDto clientDataDto) {
		
		return clientDataDto.client;
	}
	
	public List<ClientDetail> toClientDetails(ClientDataDto clientDataDto) {
		
		return Arrays.asList(clientDataDto.clientDetails);
	}
	
}

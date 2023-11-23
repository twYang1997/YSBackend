package com.yessir.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yessir.backend.model.Client;
import com.yessir.backend.model.ClientDetail;
import com.yessir.backend.model.ClientDetailId;
import com.yessir.backend.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository cRepository;
	
	public class ClientData {
		
		Client client;
		
		ClientDetail[] clientDetails;
	}
	
	public void newClientData(ClientData clientData) {
		
		String clientId = newClientId();
		
		clientData.client.setStatus("1");
		clientData.client.setClientId(clientId);
		
		for (int i = 0 ; i < clientData.clientDetails.length; i++) {
			
			ClientDetailId detailId = new ClientDetailId();
			
			detailId.setClientId(clientId);
			detailId.setSeq(i);
			
			ClientDetail detail = clientData.clientDetails[i];
			
			detail.setId(detailId);
		}
	}
	
	/**
	 * new ClientId to insert
	 * 
	 * @return e.g."CLI" + 00001
	 */
	public String newClientId() {
		
		List<Client> clientList = (List<Client>)cRepository.findAll();
		
		if (clientList.size() > 0) {
			
			int seq = Integer.parseInt(clientList.get(clientList.size() - 1).getClientId().substring(3, 9));
			
			return String.format("CLI%06d", seq + 1);
			
		} else {
			
			return "CLI000001" ;
			
		}
	}
}

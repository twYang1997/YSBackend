package com.yessir.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.yessir.backend.repository.ClientRepository;
import com.yessir.backend.service.ClientService;
import com.yessir.backend.service.ClientService.ClientData;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	private final Gson gson = new Gson();
	
	@Autowired
	private ClientRepository cRepository;
	
	@Autowired
	private ClientService cService;
	
	
	@PostMapping("/insertClient")
	public String insertClient(@RequestBody String data) {
		ClientData clientData = gson.fromJson(data, ClientData.class);
		
		cService.newClientData(clientData);
		
		cRepository.save(clientData.)
		return "OK";
	}
	
}

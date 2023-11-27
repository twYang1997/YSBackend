package com.yessir.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.yessir.backend.dto.ClientDataDto;
import com.yessir.backend.mapper.DtoMapper;
import com.yessir.backend.repository.ClientDetailRepository;
import com.yessir.backend.repository.ClientRepository;
import com.yessir.backend.service.ClientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	private final Gson gson = new Gson();
	
	@Autowired
	private ClientRepository cRepository;
	
	@Autowired
	private ClientDetailRepository cdRepository;
	
	@Autowired
	private ClientService cService;
	
	@Autowired
	private DtoMapper dtoMapper;
	
	@PostMapping("/insertClient")
	public String insertClient(@RequestBody String data) {
		try {
			ClientDataDto clientData = gson.fromJson(data, ClientDataDto.class);
			
			if (!cService.guiNumberChecking(clientData.getClient().getGuiNumber())) {
				return "dup";
			}
			
			cService.newClientData(clientData);
			
			cRepository.save(dtoMapper.toClient(clientData));
			cdRepository.saveAll(dtoMapper.toClientDetails(clientData));
			
		} catch (Exception e) {
			
			return "error";
		} 
		
		return "success";
	}
	
}

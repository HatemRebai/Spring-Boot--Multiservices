package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.repositories.ClientRepository;


@Service("clientservice")
public class ClientServiceImpl implements ClienttService {

	
	@Autowired
	ClientRepository clientrepository;
	@Override
	public void saveUser(Client client) {
		clientrepository.save(client);
		
	}
	
	

}

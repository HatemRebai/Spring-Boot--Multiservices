package com.example.demo.service;

import java.util.List;

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
	@Override
	public void suppclient(Client client) {
		// TODO Auto-generated method stub
		clientrepository.delete(client);
	}
	@Override
	public Client getclientById(int id) {
		return  clientrepository.getOne(id);
		
	}
	@Override
	public List<Client> getall() {
		return clientrepository.findAll();
	}
	@Override
	public void saveUserClient(Client client) {
		clientrepository.save(client);
	}
	
	

}

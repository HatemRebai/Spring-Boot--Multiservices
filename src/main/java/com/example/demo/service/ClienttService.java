package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Client;


public interface ClienttService {

	public void saveUserClient( Client client );
	public void saveUser( Client client);
	public void suppclient(Client client);
	public Client getclientById (int id);
	public List<Client> getall();
}

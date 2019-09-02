package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Client;


public interface ClienttService {

	public void saveUser(@RequestBody Client client);
}

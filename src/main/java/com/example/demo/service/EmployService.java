package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.entities.Ouvrier;

public interface EmployService {
	
	public void saveUser(@RequestBody Ouvrier employe);

}

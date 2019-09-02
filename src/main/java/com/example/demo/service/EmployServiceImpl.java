package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.EmploRepository;


@Service("employservice")
public class EmployServiceImpl implements EmployService {

	@Autowired
	EmploRepository employrepository;
	
	@Override
	public void saveUser(Ouvrier employe) {
	
		employrepository.save(employe);
	}

}

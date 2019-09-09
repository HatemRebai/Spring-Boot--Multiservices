package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.OuvrierRepository;


@Service("ouvrierservice")
public class OuvrierServiceImpl implements OuvrierService {

	@Autowired
	OuvrierRepository ouvrierrepository;
	
	@Override
	public void saveUser(Ouvrier ouvrier) {
	
		ouvrierrepository.save(ouvrier);
	}

}

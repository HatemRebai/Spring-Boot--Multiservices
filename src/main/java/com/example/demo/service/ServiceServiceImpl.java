package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Service;
import com.example.demo.repositories.ServiceRepository;

@org.springframework.stereotype.Service("serviceservice")
public class ServiceServiceImpl implements ServiceService {
	
	@Autowired
	ServiceRepository servicerepository;

	@Override
	public void saveService(Service service) {
		servicerepository.save(service);
		
		
	}

}

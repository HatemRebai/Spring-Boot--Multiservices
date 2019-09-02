package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Service;
import com.example.demo.service.ServiceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	ServiceService serviceservice;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Service service) {
	  serviceservice.saveService(service);
		
	}

}

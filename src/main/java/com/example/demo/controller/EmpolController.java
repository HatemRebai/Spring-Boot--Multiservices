package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Ouvrier;
import com.example.demo.service.EmployService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employ")
public class EmpolController {
	
	@Autowired
	EmployService employservice;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Ouvrier emp) {
		employservice.saveUser(emp);
		
	}

}

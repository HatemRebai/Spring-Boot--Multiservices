package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")

public class UserController {
	@Autowired
	UserService userservice;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Client user) {
		user.setRole(Role.client);
		userservice.saveUser(user);
		
	}
	
	@RequestMapping(value="/addouv",method=RequestMethod.POST)
	public void saveUser(@RequestBody Ouvrier user) {
		user.setRole(Role.ouvrier);
		userservice.saveOuvrier(user);
		
	}
	
	
	
	
	
	
	

}

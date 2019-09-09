package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Ouvrier;
import com.example.demo.service.OuvrierService;

@CrossOrigin("*")
@RestController
@RequestMapping("/ouvrier")
public class OuvrierController {
	
	@Autowired
	OuvrierService ouvrierservice;
	
	/*@RequestMapping(value="/addouvrier",method=RequestMethod.POST)
	public void saveUser(@RequestBody Ouvrier emp) {
		ouvrierservice.saveUser(emp);
		
	}*/

}

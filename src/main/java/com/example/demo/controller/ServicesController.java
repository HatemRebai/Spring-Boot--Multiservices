package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.Services;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.service.ServicesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/service")
public class ServicesController {
	@Autowired
ServicesService servicesservice;	
	@Autowired
	OuvrierRepository ouvrierrepository;
   	
    @RequestMapping(value="/addservice/{idouvrier}", method=RequestMethod.POST)
    public void  saveService(@RequestBody Services services,@PathVariable("idouvrier") Integer idouvrier) {
    	Ouvrier ouvrier = ouvrierrepository.getOne(idouvrier);
		services.setOuvrier(ouvrier);
    	servicesservice.addservice(services);
    	}
	
}

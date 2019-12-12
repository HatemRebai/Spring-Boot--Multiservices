package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.Services;
import com.example.demo.entities.User;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.repositories.ServicesRepository;
import com.example.demo.service.ClientServiceImpl;
import com.example.demo.service.ClienttService;
import com.example.demo.service.ServicesService;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/service")
public class ServicesController {
	
	
	@Autowired
    ServicesService servicesservice;	
	@Autowired
	OuvrierRepository ouvrierrepository;
   	@Autowired
   	ServicesRepository servicesrepository;
   	@Autowired
   	ClientRepository clientrepository;
   	@Autowired
   	ClienttService clientservice;
   	@Autowired
   	UserService userservice;
	
 
	@RequestMapping(value="/allservice", method= RequestMethod.GET)
	public List<Services> getall(){
		return servicesservice.getAll();

	}
    @RequestMapping(value="/addservice", method=RequestMethod.POST)
    public void addservice(@RequestBody Services services) {
    	servicesservice.addservice(services); 	
    }
    
    @RequestMapping(value="/updateservices/{id}", method=RequestMethod.PUT)
    public void updateservices(@RequestBody Services services , @PathVariable("id") Integer id) {
    	Services updatedService = servicesrepository.getOne(id);
    	updatedService.setDescription(services.getDescription());
    	updatedService.setTitre(services.getTitre());
    	servicesservice.updateservices(updatedService);
    }	    
    @RequestMapping(value="/deleteservices/{id}", method= RequestMethod.DELETE)
    public void deletes(@PathVariable("id") Integer id) {
    	Services services = servicesrepository.getOne(id);
    	servicesrepository.delete(services);
    }

}

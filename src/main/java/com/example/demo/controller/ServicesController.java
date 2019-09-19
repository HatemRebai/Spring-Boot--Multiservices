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
import com.example.demo.repositories.ServicesRepository;
import com.example.demo.service.ServicesService;

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
	
    @RequestMapping(value="/addservice/{idouvrier}", method=RequestMethod.POST)
    public void  saveService(@RequestBody Services services,@PathVariable("idouvrier") Integer idouvrier) {
    	Ouvrier ouvrier = ouvrierrepository.getOne(idouvrier);
		services.setOuvrier(ouvrier);
    	servicesservice.addservice(services);
    	}
    
    
    @RequestMapping(value="/updateservices/{id}", method=RequestMethod.PUT)
    public void updateservices(@RequestBody Services services , @PathVariable("id") Integer id) {
    	Services updatedService = servicesrepository.getOne(id);
    	updatedService.setDecription(services.getDecription());
    	updatedService.setPrice(services.getPrice());
    	updatedService.setTitre(services.getTitre());
    	servicesservice.updateservices(updatedService);
    }
	
    @RequestMapping(value="/deleteservices/{id}", method= RequestMethod.DELETE)
    public void deletes(@PathVariable("id") Integer id) {
    	Services services = servicesrepository.getOne(id);
    	servicesrepository.delete(services);
    }
}

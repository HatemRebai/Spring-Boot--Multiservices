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
import com.example.demo.entities.Role;
import com.example.demo.entities.Services;
import com.example.demo.entities.User;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.service.OuvrierService;
import com.example.demo.service.ServicesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/ouvrier")
public class OuvrierController {
	
	@Autowired
	OuvrierService ouvrierservice;
	
	@Autowired
	ServicesService serviceService;
	
	@Autowired
	OuvrierRepository ouvrierrepository;
	
	@RequestMapping(value="/addouvrier",method=RequestMethod.POST)
	public void saveUser(@RequestBody Ouvrier emp) {
		emp.setRole(Role.ouvrier);
		ouvrierservice.save(emp);
	}
	
	@RequestMapping(value="/add/{idServices}",method=RequestMethod.POST)
	public void saveUserFormation(@RequestBody Ouvrier ouvrier , @PathVariable("idServices") int idServices)
	{
		Services f = serviceService.getServiceById(idServices);
		ouvrier.setService(f);
		ouvrier.setRole(Role.ouvrier);
		ouvrier.setAvailable(true);
		ouvrierservice.save(ouvrier);;
	}

	@RequestMapping(value="/deleteouvrier/{id}",method=RequestMethod.DELETE)
	public void deleteouvrier(@PathVariable("id") Integer id) {
		Ouvrier o = ouvrierservice.getouvrierById(id);
		ouvrierservice.suppouvrier(o);
	}
	@RequestMapping(value="/allouvrier", method= RequestMethod.GET)
	public List<Ouvrier> getall(){
		return ouvrierservice.getall();
	}
	
	@RequestMapping(value="/available", method= RequestMethod.GET)
	public List<Ouvrier> Available(){
		return ouvrierservice.getAvailable(true);
	}
	@RequestMapping(value="/notavailable", method= RequestMethod.GET)
	public List<Ouvrier> notAvailable(){
		return ouvrierservice.getNotAvailable(false);
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
 	public void Update(@PathVariable("id") Integer id) {
		Ouvrier o = ouvrierservice.getouvrierById(id);
		o.setAvailable(!o.isAvailable());
		ouvrierservice.setEtatOuvrier(o);
		}
	@RequestMapping(value="/getOne/{id}",method=RequestMethod.GET)
 	public int getOne(@PathVariable("id") Integer id) {
		Ouvrier o = ouvrierservice.getouvrierById(id);
		return o.getId();
		}
}

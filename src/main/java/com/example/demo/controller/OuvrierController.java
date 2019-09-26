package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.service.OuvrierService;

@CrossOrigin("*")
@RestController
@RequestMapping("/ouvrier")
public class OuvrierController {
	
	@Autowired
	OuvrierService ouvrierservice;
	
	@Autowired
	OuvrierRepository ouvrierrepository;
	
	@RequestMapping(value="/addouvrier",method=RequestMethod.POST)
	public void saveUser(@RequestBody Ouvrier emp) {
		ouvrierservice.saveUser(emp);
	}

	@RequestMapping(value="/deleteouvrier/{id}",method=RequestMethod.DELETE)
	public void deleteouvrier(@PathVariable("id") Integer id) {
		Ouvrier o = ouvrierservice.getouvrierById(id);
		ouvrierservice.suppouvrier(o);
	}
	@RequestMapping(value="/allouvrier", method= RequestMethod.GET)
	public List<Ouvrier> getall(){
		return ouvrierrepository.findAll();

	}
}

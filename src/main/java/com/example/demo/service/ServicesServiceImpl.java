package com.example.demo.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entities.Services;
import com.example.demo.entities.User;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.repositories.ServicesRepository;
import org.springframework.stereotype.Service;

@Service("ServicesService")
public class ServicesServiceImpl  implements ServicesService{

	@Autowired
	ServicesRepository servicesrepository;
	@Autowired
	OuvrierRepository ouvrierrepository;
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addservice(Services services) {
		servicesrepository.save(services);
	}

	public void deleteservices(Integer id) {
		Services services =  servicesrepository.getOne(id);
		servicesrepository.delete(services);
	}

	@Override
	public void updateservices(Services services) {
		servicesrepository.save(services);

	}

	@Override
	public Services getServiceByUserEmail(String Email) {
		User u = new User();
		Email = u.getEmail();
		return null;
	}

	@Override
	public Services getServiceById(Integer id) {
		return	servicesrepository.getOne(id);
	}
	@Override
	public List<Services> getAll() {
		return servicesrepository.findAll();
	}

	
}

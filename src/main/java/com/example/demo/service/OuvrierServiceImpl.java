package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.OuvrierRepository;


@Service("ouvrierservice")
public class OuvrierServiceImpl implements OuvrierService {

	@Autowired
	OuvrierRepository ouvrierrepository;
	
	@Override
	public void saveUser(Ouvrier ouvrier) {
		ouvrierrepository.save(ouvrier);
	}

	@Override
	public void suppouvrier(Ouvrier ouvrier) {
		ouvrierrepository.delete(ouvrier);
	}

	@Override
	public Ouvrier getouvrierById(Integer id) {
		return	ouvrierrepository.getOne(id);
	}

	@Override
	public List<Ouvrier> getall() {
		// TODO Auto-generated method stub
		return ouvrierrepository.findAll();
	}

}

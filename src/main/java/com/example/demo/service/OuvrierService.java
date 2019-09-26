package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Ouvrier;

public interface OuvrierService {
	
	public void saveUser( Ouvrier ouvrier);
	public void suppouvrier(Ouvrier ouvrier);
	public Ouvrier getouvrierById(Integer id);
	public List<Ouvrier> getall();
}

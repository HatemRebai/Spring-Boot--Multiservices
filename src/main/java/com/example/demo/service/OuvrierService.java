package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Ouvrier;

public interface OuvrierService {
	
	
	public void suppouvrier(Ouvrier ouvrier);
	public Ouvrier getouvrierById(Integer id);
	public List<Ouvrier> getall();
	public List<Ouvrier> getAvailable(boolean available);
	public List<Ouvrier> getNotAvailable(boolean available);
	public void setEtatOuvrier (Ouvrier ouvrier);
	public void save(Ouvrier ouvrier);
}

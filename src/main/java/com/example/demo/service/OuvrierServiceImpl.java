package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.OuvrierRepository;


@Service("ouvrierservice")
public class OuvrierServiceImpl implements OuvrierService {

	@Autowired
	OuvrierRepository ouvrierrepository;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void save(Ouvrier ouvrier) {
		ouvrier.setAvailable(true);
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
		return ouvrierrepository.findAll();
	}

	@Override
	public List<Ouvrier> getAvailable(boolean available) {
		
		TypedQuery<Ouvrier> query  = em.createQuery("SELECT o FROM Ouvrier o WHERE o.available = :available", Ouvrier.class);
		query.setParameter("available", available);
		return query.getResultList();
	}

	@Override
	public List<Ouvrier> getNotAvailable(boolean available) {
		TypedQuery<Ouvrier> query  = em.createQuery("SELECT o FROM Ouvrier o WHERE o.available = :available", Ouvrier.class);
		query.setParameter("available", available);
		return query.getResultList();
	}

	@Override
	public void setEtatOuvrier(Ouvrier ouvrier) {
		ouvrierrepository.save(ouvrier);
	}

	

}

package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Reservation;
import com.example.demo.entities.Services;
import com.example.demo.repositories.ReservationRepository;

@Service("reservationService")
public class reservationServiceImpl  implements reservationService {
	
	
	@Autowired
	ReservationRepository reservationrepository;
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addservice(Reservation reservation) {
		reservationrepository.save(reservation);
	}

	@Override
	public Reservation getReservationById(Integer id) {
		return	reservationrepository.getOne(id);
	}

	@Override
	public List<Reservation> getAll() {
		return reservationrepository.findAll();
	}
	@Override
	public List<Reservation> getEtat(String etat) {
		TypedQuery<Reservation> query  = em.createQuery("SELECT r FROM Reservation r WHERE r.etat = :etat", Reservation.class);
		query.setParameter("etat", etat);
		return query.getResultList();
	}
}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Reservation;
import com.example.demo.entities.Services;


public interface reservationService {


	public void addservice(Reservation reservation);
	public Reservation getReservationById(Integer id);
	public List<Reservation> getAll();
	public List<Reservation> getEtat(String etat);
}

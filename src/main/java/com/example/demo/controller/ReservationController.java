package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.Services;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.ServicesRepository;
import com.example.demo.service.ClienttService;
import com.example.demo.service.OuvrierService;
import com.example.demo.service.ServicesService;
import com.example.demo.service.reservationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	
	@Autowired
	ServicesRepository servicesrepository;
	@Autowired
	ServicesService serviceservice;
	@Autowired
	ClientRepository clientrepository;
  	@Autowired
   	ClienttService clientservice;
  	@Autowired
  	OuvrierService ouvrierservice;
	@Autowired
	reservationService reservationservice;
	
	
	@RequestMapping(value="/all", method= RequestMethod.GET)
	public List<Reservation> getall(){
		return reservationservice.getAll();
	}
	
    @RequestMapping(value="/reserveClt/{idclient}", method=RequestMethod.POST)
    public void addClienttoReservation(@RequestBody Reservation reservation, @PathVariable("idclient") Integer idclient) {
    
    	Client c = clientservice.getclientById(idclient);
    	reservation.setClient(c);
    	reservation.setEtat("initial");
    	reservationservice.addservice(reservation); 	
    }
    
    @RequestMapping(value="/reserveServ/{id}", method=RequestMethod.POST)
    public void addserviceToResrvation(@RequestBody Services s, @PathVariable("id") Integer id) {
       
    	Reservation reservation = reservationservice.getReservationById(id);
    	reservation.setService(s);
    	reservationservice.addservice(reservation); 
    }
    
    @RequestMapping(value="/reserveOuv/{id}", method=RequestMethod.GET)
    public void addOuvrierToResrvation(@PathVariable("id") Integer id , @RequestParam (value = "idouv", required = true) Integer idouv) {
  
    	Reservation reservation = reservationservice.getReservationById(id);
    	Ouvrier o = ouvrierservice.getouvrierById(idouv);
    	reservation.setOuvrier(o);
    	reservationservice.addservice(reservation);
		
    }
    
	@RequestMapping(value="/getinitial", method= RequestMethod.GET)
	public List<Reservation> getInitial(){
		return reservationservice.getEtat("initial");
	}
	@RequestMapping(value="/getencours", method= RequestMethod.GET)
	public List<Reservation> getEncours() {
		return reservationservice.getEtat("encours");
	}
	@RequestMapping(value="/getterminer", method= RequestMethod.GET)
	public List<Reservation> getTerminer(){
		return reservationservice.getEtat("terminer");
	}  
  
    @RequestMapping(value="/validateReservation/{id}", method=RequestMethod.GET)
    public void validateServices(@PathVariable("id") Integer id) {
    	Reservation validate = reservationservice.getReservationById(id);
    	validate.setEtat("encours");
    	reservationservice.addservice(validate);	
    }
    
     @RequestMapping(value="/finishReservation/{id}",method=RequestMethod.GET)
    public void updateetat(@PathVariable("id") Integer id ) {
    	 
    		Reservation finish = reservationservice.getReservationById(id);
        	finish.setEtat("terminer");
        	Date date = new Date();
        	finish.setDatefin(date);
        	reservationservice.addservice(finish);
    }
}

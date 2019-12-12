package com.example.demo.entities;


import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name="clients")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client extends User implements Serializable {
	
	private static final long serialVersionUID = 5926468583005150707L;
	
	 @GeneratedValue(strategy=GenerationType.IDENTITY)

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	    @JsonIgnore	
		@OneToMany(mappedBy="client",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private List<Reservation> reservation = new ArrayList<Reservation>();

		public List<Reservation> getReservation() {
			return reservation;
		}
		public void setReservation(List<Reservation> reservation) {
			this.reservation = reservation;
		}

		
		
		
}

package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reservation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String description;
	private Date datedebut ;
	private Date datefin;
	private String etat;
	
	

	@JoinColumn(name = "idService") 
	@OneToOne
	private Services service ;
	
	@JoinColumn(name = "idclient") 
	@OneToOne 
	private Client client ;
	
	@JoinColumn(name = "idOuvrier", nullable = true) 
	@OneToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	private Ouvrier ouvrier ;
	

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Reservation(int id, String description, Date dateDebut, Date datefin, String etat, Services service,
			Client client, Ouvrier ouvrier) {
		super();
		this.id = id;
		this.description = description;
		this.datedebut = dateDebut;
		this.datefin = datefin;
		this.etat = etat;
		this.service = service;
		this.client = client;
		this.ouvrier = ouvrier;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}


	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Ouvrier getOuvrier() {
		return ouvrier;
	}

	public void setOuvrier(Ouvrier id) {
		this.ouvrier = id;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", description=" + description + ", datedebut=" + datedebut + ", datefin="
				+ datefin + ", Etat=" + etat + ", service=" + service + ", client=" + client + ", ouvrier=" + ouvrier
				+ "]";
	}




}

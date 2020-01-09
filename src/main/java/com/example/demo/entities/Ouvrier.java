package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "files")

public class Ouvrier extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private boolean available ;
	private Typedouvrier type;	

	
	@JsonIgnore
	@JoinColumn(name = "idService" ) 
	@ManyToOne 
	private Services service ;
	
	public Ouvrier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ouvrier(boolean available, Typedouvrier type, Services service) {
		super();
		this.available = available;
		this.type = type;
		this.service = service;
	}
	public Services getService() {
		return service;
	}
	public void setService(Services service) {
		this.service = service;
	}
	public Typedouvrier getType() {
		return type;
	}
	public void setType(Typedouvrier type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Ouvrier [available=" + available + ", type=" + type + ", service=" + service + "]";
	}

	}

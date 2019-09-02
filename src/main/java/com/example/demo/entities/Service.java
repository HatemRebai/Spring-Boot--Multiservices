package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Service implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre;

	private String decription;
	private String price  ;
	
	@ManyToOne
	private Ouvrier employee ;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(int id, String name, String decription, String price, Ouvrier employee) {
		super();
		this.id = id;
		this.titre = name;
		this.decription = decription;
		this.price = price;
		this.employee = employee;
	}
	
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Ouvrier getEmployee() {
		return employee;
	}
	public void setEmployee(Ouvrier employee) {
		this.employee = employee;
	}

	
	
}

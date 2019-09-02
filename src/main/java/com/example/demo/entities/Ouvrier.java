package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

public class Ouvrier extends User implements Serializable {
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int Moyenne=0;
	private Typedouvrier type;
	
	@OneToMany(mappedBy="employee")
	private List<Service> servicelist =new ArrayList<Service>();
	
	
	


	public Ouvrier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getMoyenne() {
		return Moyenne;
	}


	public void setMoyenne(int moyenne) {
		Moyenne = moyenne;
	}



	














	public Ouvrier(int moyenne, Typedouvrier type, List<Service> servicelist) {
		super();
		Moyenne = moyenne;
		this.type = type;
		this.servicelist = servicelist;
	}




	public Typedouvrier getType() {
		return type;
	}


	public void setType(Typedouvrier type) {
		this.type = type;
	}


	public List<Service> getServicelist() {
		return servicelist;
	}


	public void setServicelist(List<Service> servicelist) {
		this.servicelist = servicelist;
	}


	
	
	

}

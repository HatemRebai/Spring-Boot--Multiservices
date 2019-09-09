package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comments {

	private static final long serialVersionUID = 5926468583005150707L;
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String text;
	
	@JoinColumn(name = "idouvrier") 
	@ManyToOne 
	private Ouvrier ouvriers ;

	
	@JoinColumn(name = "idclient") 
	@JsonIgnore
	@ManyToOne 
	private Client client ;


	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Comments(int id, Ouvrier ouvrier, Client client) {
		super();
		this.id = id;
		this.ouvriers = ouvrier;
		this.client = client;
	}


	@Override
	public String toString() {
		return "Comments [id=" + id + ", ouvrier = " + ouvriers + " client=" + client + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Ouvrier getOuvrier() {
		return ouvriers;
	}


	public void setOuvrier(Ouvrier ouvrier) {
		this.ouvriers = ouvrier;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}

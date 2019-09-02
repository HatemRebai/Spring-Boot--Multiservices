package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String username;

	private String email;
	private String mdp  ;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Admin(int id, String username, String email, String mdp) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.mdp = mdp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	

}

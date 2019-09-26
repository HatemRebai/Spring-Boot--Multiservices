package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.config.BCryptManagerUtil;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 5926468583005150707L;
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String Adresse;
	private String tel;
	
	private Role role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(String username, String password, String adresse) {
		super();
		this.username = username;
		this.password = BCryptManagerUtil.passwordEncoder().encode(password);
		Adresse = adresse;
	}


	public User(int id, String username, String password, String adresse, String tel, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = BCryptManagerUtil.passwordEncoder().encode(password);
		Adresse = adresse;
		this.tel = tel;
		this.role = role;
	}







	public Role getRole() {
		return role;
	}







	public void setRole(Role role) {
		this.role = role;
	}







	public String getAdresse() {
		return Adresse;
	}



	public void setAdresse(String adresse) {
		Adresse = adresse;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = BCryptManagerUtil.passwordEncoder().encode(password);
	}



	@Override
	public String toString() {
		return "{id:" + id + ", username:" + username + ", Adresse:" + Adresse + ", tel:" + tel + ", role:" + role
				+ "}";
	}
	
	
    	

}

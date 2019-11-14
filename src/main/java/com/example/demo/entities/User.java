package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TypedQuery;



@Entity
public class User implements Serializable {
	
	//private static final long serialVersionUID = 5926468583005150707L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
<<<<<<< HEAD
	private String Adresse;
	
	@Column(unique = true)
	private String email;
	private String tel;
	private Role role;


=======
	private String adresse;
	private String tel;
	private String email;
	private Role role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String username, String password, String adresse) {
		super();
		this.username = username;
		this.password = BCryptManagerUtil.passwordEncoder().encode(password);
		this.adresse = adresse;
	}
	public User(int id, String username, String password, String adresse, String tel, Role role, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = BCryptManagerUtil.passwordEncoder().encode(password);
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.role = role;
	}
>>>>>>> 4b7f787ae84bb69b4c47c726f1a3819beb07ffd8
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
<<<<<<< HEAD
	public void setTel(String tel) {
		this.tel = tel;
	}
=======

	public void setTel(String tel) {
		this.tel = tel;
	}

>>>>>>> 4b7f787ae84bb69b4c47c726f1a3819beb07ffd8
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
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	
	}

<<<<<<< HEAD
	public User(int id, String username, String password, String adresse, String email, String tel, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		Adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.role = role;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", Adresse=" + Adresse
				+ ", email=" + email + ", tel=" + tel + ", role=" + role + "]";
=======
	@Override
	public String toString() {
		return "{id:" + id + ", username:" + username + ", adresse:" + adresse + ", emai:"+email+", tel:" + tel + ", role:" + role
				+ "}";
>>>>>>> 4b7f787ae84bb69b4c47c726f1a3819beb07ffd8
	}



	
    	

}

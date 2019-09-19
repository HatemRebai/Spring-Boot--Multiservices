package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Services implements Serializable {
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre;
	private String decription;
	private String price  ;
	
	
	@JoinColumn(name = "idouvrier") 
	@JsonIgnore
	@ManyToOne 
	private Ouvrier ouvrier ;

	
		public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


		public Services(int id, String titre, String decription, String price, Ouvrier ouvrier) {
			super();
			this.id = id;
			this.titre = titre;
			this.decription = decription;
			this.price = price;
			this.ouvrier = ouvrier;
		}


		@Override
		public String toString() {
			return "Service [id=" + id + ", titre=" + titre + ", decription=" + decription + ", price=" + price
					+ ", ouvrier=" + ouvrier + "]";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
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


		public Ouvrier getOuvrier() {
			return ouvrier;
		}


		public void setOuvrier(Ouvrier ouvrier) {
			this.ouvrier = ouvrier;
		}



	}

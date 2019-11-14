package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
	private Date date  ;



	@JoinColumn(name = "idclient") 
	@JsonIgnore
	@ManyToOne 
	private Client client ;
	
	@JoinColumn(name = "idouvrier") 
	@ManyToOne 
	private Ouvrier ouvrier ;

	
	
		public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


		public Ouvrier getOuvrier() {
		return ouvrier;
	}


	public void setOuvrier(Ouvrier ouvrier) {
		this.ouvrier = ouvrier;
	}


		public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


	




		public Services(int id, String titre, String decription, Date date, Client client, Ouvrier ouvrier) {
			super();
			this.id = id;
			this.titre = titre;
			this.decription = decription;
			this.date = date;
			this.client = client;
			this.ouvrier = ouvrier;
		}


		@Override
		public String toString() {
			return "Services [id=" + id + ", titre=" + titre + ", decription=" + decription + ", date=" + date
					+ ", client=" + client + ", ouvrier=" + ouvrier + "]";
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


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}
	}

package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Services implements Serializable {
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre;
	private String description;

	
	@JsonIgnore
	@OneToMany(mappedBy="service",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Ouvrier> Ouvrier = new ArrayList<Ouvrier>();
	
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
		
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Ouvrier> getOuvrier() {
		return Ouvrier;
	}


		public void setOuvrier(List<Ouvrier> ouvrier) {
		this.Ouvrier = ouvrier;
	}


		public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Services(int id, String titre, String description, Date date, String etat,
			List<com.example.demo.entities.Ouvrier> ouvrier) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		Ouvrier = ouvrier;
	}


	@Override
	public String toString() {
		return "Services [id=" + id + ", titre=" + titre + ", description=" + description + ", Ouvrier=" + Ouvrier + "]";
	}
	}

package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "files")

public class Ouvrier extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private float Moyenne;
	private Typedouvrier type;

		
	@OneToMany(mappedBy="ouvriers", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Comments> comments = new ArrayList<Comments>();

	@OneToMany(mappedBy="ouvrier", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Services> services = new ArrayList<Services>();

	public float getMoyenne() {
		return Moyenne;
	}


	public void setMoyenne(float moyenne) {
		Moyenne = moyenne;
	}


	public Typedouvrier getType() {
		return type;
	}


	public void setType(Typedouvrier type) {
		this.type = type;
	}

	
	}

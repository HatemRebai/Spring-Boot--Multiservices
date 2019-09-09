package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Ouvrier extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private float Moyenne;
	private Typedouvrier type;
	
	@OneToMany(mappedBy="ouvrier", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Services> service = new ArrayList<Services>();

		
	@OneToMany(mappedBy="ouvriers", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Comments> comments = new ArrayList<Comments>();

	}

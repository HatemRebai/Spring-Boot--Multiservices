package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments {

	private static final long serialVersionUID = 5926468583005150707L;
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
}

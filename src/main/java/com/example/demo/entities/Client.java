package com.example.demo.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity

public class Client extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


}

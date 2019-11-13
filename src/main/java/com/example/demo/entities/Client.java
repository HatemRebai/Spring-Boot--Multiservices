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
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name="clients")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client extends User implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	
	 @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Date date  ;

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


		@OneToMany(mappedBy="client",  cascade = CascadeType.ALL)
		private List<Comments> comments = new ArrayList<Comments>();
	
		
		@OneToMany(mappedBy="client",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		//@JsonIgnore
		private List<Services> services = new ArrayList<Services>();
		
		
	
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		
		public List<Services> getServices() {
			return services;
		}

		public   void setServices(List<Services> serv) {
			this.services = serv;
		}

		public List<Comments> getComments() {
			return comments;
		}

		public void setComments(List<Comments> comments) {
			this.comments = comments;
		}

		@Override
		public String toString() {
			return "Client [date=" + date + ", comments=" + comments + ", services=" + services + "]";
		}


		
}

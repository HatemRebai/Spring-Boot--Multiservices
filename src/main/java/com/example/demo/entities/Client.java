package com.example.demo.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;



@Entity

public class Client extends User implements Serializable {

		private static final long serialVersionUID = 1L;
	
		@OneToMany(mappedBy="client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private List<Comments> comments = new ArrayList<Comments>();
	
		public List<Comments> getComments() {
			return comments;
		}

		public void setComments(List<Comments> comments) {
			this.comments = comments;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Client [comments=" + comments + "]";
		}
}

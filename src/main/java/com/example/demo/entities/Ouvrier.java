package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "files")

public class Ouvrier extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private float Moyenne;
	private Typedouvrier type;
	
	@OneToMany(mappedBy="ouvrier", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Services> service = new ArrayList<Services>();

		
	@OneToMany(mappedBy="ouvriers", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Comments> comments = new ArrayList<Comments>();

	
	 
	    @GenericGenerator(name = "uuid", strategy = "uuid2")

	    private String fileName;

	    private String fileType;

	    @Lob
	    private byte[] data;

	    public Ouvrier() {

	    }

	    public Ouvrier(String fileName, String fileType, byte[] data) {
	        this.fileName = fileName;
	        this.fileType = fileType;
	        this.data = data;
	    }

		
		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFileType() {
			return fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public byte[] getData() {
			return data;
		}

		public void setData(byte[] data) {
			this.data = data;
		}

	}

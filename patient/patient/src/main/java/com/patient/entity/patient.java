package com.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false)
	private Integer id;
	@Column(name = "name", nullable=false)
	private String name;
	@Column(name = "dateofvisit", nullable=false)
	private String dateofvisit;
	@Column(name = "visiteddoctor", nullable=false)
	private String visiteddoctor;
	
	public patient() {
		
	}
	
	
public patient (Integer id, String name, String dateofvisit, String visiteddoctor) {
		super();
		
		this.id= id;
		this.name= name;
		this.dateofvisit = dateofvisit;
		this.visiteddoctor= visiteddoctor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofvisit() {
		return dateofvisit;
	}

	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}

	public String getVisiteddoctor() {
		return visiteddoctor;
	}

	public void setVisiteddoctor(String visiteddoctor) {
		this.visiteddoctor = visiteddoctor;
	}
	
	
	

}

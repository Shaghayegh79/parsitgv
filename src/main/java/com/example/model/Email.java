package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//import org.springframework.web.bind.annotation.CrossOrigin;
//@CrossOrigin
@Entity
@Table(name = "tab_email", schema="parsitgv")
public class Email {
	@Id @GeneratedValue
	private Long id;
	@NotNull
	private String emailid;
	@NotNull
	private String suffisso;
	
	public Email() {
		//super();
	}
	
	public Email(Long id, String email, String suffisso) {
		//super();
		this.id = id;
		this.emailid = email;
		this.suffisso = suffisso;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return emailid;
	}
	public void setEmail(String emailid) {
		this.emailid = emailid;
	}

	public String getSuffisso() {
		return suffisso;
	}

	public void setSuffisso(String suffisso) {
		this.suffisso = suffisso;
	}
	
	
}

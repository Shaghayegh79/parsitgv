package com.example.model;
//import java.util.ArrayList;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

//import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;
//@CrossOrigin
@Entity
@XmlRootElement 
@Table(name = "tab_account", schema="parsitgv")
public class Account {
	@Id
	private Long id;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private boolean enabled=true;
	
	@NotNull
	private boolean credentialsexpired=false;
	
	@NotNull
	private boolean expired=false;
	
	@NotNull
	private boolean locked=false;
	
	@OneToMany(mappedBy="account",fetch = FetchType.EAGER)
	private Set<RolePerAccount> rolesPerAccount;
	
	@Column(name="tab_cliente_id",insertable = true, updatable = true)
	private Long cliente_id;
	
	@OneToOne
	@JoinColumn(name = "tab_cliente_id",insertable = false, updatable = false)
	private Cliente cliente;

	public Account() {
		//super();
	}

	public Account(Long id, String username, String password, boolean enabled, boolean credentialsexpired,
			boolean expired, boolean locked, Set<RolePerAccount> rolesPerAccount, Long cliente_id, Cliente cliente) {
		//super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.credentialsexpired = credentialsexpired;
		this.expired = expired;
		this.locked = locked;
		this.rolesPerAccount = rolesPerAccount;
		this.cliente_id = cliente_id;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isCredentialsexpired() {
		return credentialsexpired;
	}
	public void setCredentialsexpired(boolean credentialsexpired) {
		this.credentialsexpired = credentialsexpired;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	public Long getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}
	
	@XmlTransient
	@JsonIgnore
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@XmlTransient
	@JsonIgnore
	public Set<RolePerAccount> getRolesPerAccount() {
		return rolesPerAccount;
	}
	public void setRolesPerAccount(Set<RolePerAccount> rolesPerAccount) {
		this.rolesPerAccount = rolesPerAccount;
	}
	 
	
	




}

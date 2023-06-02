package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")

public class client {
	
	public String getNameCl() {
		return nameCl;
	}

	public void setNameCl(String nameCl) {
		this.nameCl = nameCl;
	}

	public String getLastNameCl() {
		return lastNameCl;
	}

	public void setLastNameCl(String lastNameCl) {
		this.lastNameCl = lastNameCl;
	}

	public String getCodeCl() {
		return codeCl;
	}

	public void setCodeCl(String codeCl) {
		this.codeCl = codeCl;
	}

	public String getTelCl() {
		return telCl;
	}

	public void setTelCl(String telCl) {
		this.telCl = telCl;
	}

	@Column(name="nameCl", nullable=false, length=255, unique = true)
	
    String nameCl;
	
	@Column(name="lastNameCl", nullable=false, length=255, unique = true)

	String lastNameCl;
	
	@Id @Column(name="codeCl", nullable=false, length=255, unique = true) 

    String codeCl;

	@Column(name="telCl", nullable=false, length=255, unique = true) 
	
	String telCl;


	public client() {
		
	}
	
	/*public client(String codeCl, String nameCl, String lastNameCl, String telCl) {
	super();
	this.codeCl = codeCl;
	this.nameCl = nameCl;
	this.lastNameCl = lastNameCl;
	this.telCl = telCl;
}
*/
	@Override
	public String toString() {
		return ""+codeCl+","+nameCl+","+lastNameCl+","+telCl+"";
				
	}
	
	
}

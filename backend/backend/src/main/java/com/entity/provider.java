package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class provider {
	@Id String Code_Provider;

	String Name_Provider;
	public provider(String Name_Provider, String Code_Provider, String Tel_Provider, String E_Mail_Provider) {
		super();
		this.Name_Provider = Name_Provider;
		this.Code_Provider = Code_Provider;
		this.Tel_Provider = Tel_Provider;
		this.E_Mail_Provider = E_Mail_Provider;
	}
	
	public provider() {
		
	}
	@Override
	public String toString() {
		return "" + Code_Provider + "," + Name_Provider + ","
				+ Tel_Provider + "," + E_Mail_Provider + "";
	}
	String Tel_Provider;
	String E_Mail_Provider;
	

}

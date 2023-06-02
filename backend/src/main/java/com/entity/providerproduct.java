package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="providerproduct")

public class providerproduct {
	
	@Column(name="Code_Provider", nullable=false, length=255,  unique = true)

	String Code_Provider;
	
	@Column(name="Code_Product", nullable=false, length=255,  unique = true)

	String Code_Product;
	
	@Column(name="Date_Provider_Product", nullable=false, length=255,  unique = true)

	String Date_Provider_Product ;
	

	@Id @GeneratedValue int id;


	public providerproduct( String Code_Product, String Code_Provider,String Date_Provider_Product) {
		super();
		this.Code_Product = Code_Product;
		this.Code_Provider = Code_Provider;
		this.Date_Provider_Product = Date_Provider_Product;
		this.id=id;
	}

	public providerproduct() {}

	@Override
	public String toString() {
		return "" + Code_Provider + "," + Code_Product
				+ "," + Date_Provider_Product + "," + id + "";
	}
}

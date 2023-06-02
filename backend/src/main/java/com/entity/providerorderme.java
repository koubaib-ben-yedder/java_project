package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class providerorderme{
	
	@Column(name="Code_Provider", nullable=false, length=255,  unique = true)

	String Code_Provider;
	
	@Column(name="Code_Order_Me", nullable=false, length=255,unique = true)

	String Code_Order_Me;
	
	@Column(name="Date_Product_Order_Me", nullable=false, length=255, unique = true)

	String Date_Product_Order_Me;
	
	@Id @GeneratedValue int id;

	public providerorderme(String code_Provider, String code_Order_Me, String Date_Product_Order_Me) {
		super();
		this.id=id;
		this.Code_Provider = code_Provider;
		this.Code_Order_Me = code_Order_Me;
		this.Date_Product_Order_Me = Date_Product_Order_Me;
	}

	@Override
	public String toString() {
		return "" + Code_Provider + "," + Code_Order_Me
				+ "," + Date_Product_Order_Me + "," + id + "";
	}

	

}

package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class productorderclient {
	
	@Column(name="Code_Order_Product", nullable=false, length=255, unique = true)

	String Code_Order_Product;
	@Column(name="Code_Order_Client", nullable=false, length=255,unique = true)

	String Code_Order_Client;
	@Column(name="Date_Product_Order_Client", nullable=false, length=255,unique = true)

	String Date_Product_Order_Client;
	@Id @GeneratedValue int id=0;

	public productorderclient(String Code_Product, String Code_Order_Product, String date_Product_Order_Client) {
		super();
		this.id=id;
		this.Code_Order_Product = Code_Order_Product;
		this.Code_Order_Client = Code_Order_Product;
		this.Date_Product_Order_Client = date_Product_Order_Client;
	}

	public productorderclient() {}
	@Override
	public String toString() {
		return "" + Code_Order_Product + "," + Code_Order_Client
				+ "," + Date_Product_Order_Client + "," + id + "";
	}


}

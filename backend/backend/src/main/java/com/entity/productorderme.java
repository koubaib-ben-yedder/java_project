package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productorderme")
public class productorderme{
	
	
	@Column(name="Code_Order_Me", nullable=false, length=255, unique = true)

	String Code_Order_Me;
	
	@Column(name="Code_Product_Me", nullable=false, length=255,  unique = true)

	String Code_Product_Me;
	
	@Column(name="Date_Product_Order_Me", nullable=false, length=255, unique = true)

	String Date_Product_Order_Me;
	
	
	@Id @GeneratedValue int id=0;

	public productorderme(String Code_Order_Me, String Code_Product_Me, String Date_Product_Order_Me) {
		super();
		this.id=id;
		this.Code_Order_Me = Code_Order_Me;
		this.Code_Product_Me = Code_Product_Me;
		this.Date_Product_Order_Me = Date_Product_Order_Me;
	}
	
	public productorderme() {
		
	}
	
	@Override
	public String toString() {
		return "" + Code_Order_Me + "," + Code_Product_Me
				+ "," + Date_Product_Order_Me + "," + id + "";
	}
	
	

}

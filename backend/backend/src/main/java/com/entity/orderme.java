package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderme")
public class orderme {
	
	@Column(name="Code_Order_Me", nullable=false, length=255, unique = true) @Id 

	String Code_Order_Me;
	
	public orderme(String Code_Order_Me, String Name_Order_Me) {
		super();
		this.Code_Order_Me = Code_Order_Me;
		this.Name_Order_Me = Name_Order_Me;
	}
	public orderme() {
		
	}
	@Override
	public String toString() {
		return "" + Code_Order_Me + "," + Name_Order_Me ;
	}
	@Column(name="Name_Order_Me", nullable=false, length=255, unique = true)

	String Name_Order_Me;
	

}

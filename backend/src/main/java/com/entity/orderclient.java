package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderclient")

public class orderclient {

	@Column(name="Code_Order_Client", nullable=false, length=255, unique = true)

@Id String Code_Order_Client;
	public orderclient(String Code_Order_Client, String Nme_Order_Client) {
	super();
	this.Code_Order_Client = Code_Order_Client;
	this.Name_Order_Client = Name_Order_Client;
}
	public orderclient() {
		
	}
	@Override
	public String toString() {
		return "" + Code_Order_Client + "," + Name_Order_Client ;
	}
	@Column(name="Name_Order_Client", nullable=false, length=255, unique = true)

	String Name_Order_Client;
	
}

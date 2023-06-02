package com.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderC")
public class orderC {
	
	@Id
	 @Column(name="Date_Order", nullable=false, length=255, unique = true)
	String Date_Order="" ;
	 

	public orderC(String Date_Order ) {
		
		this.Date_Order = Date_Order;
	}
	public orderC() {}
	@Override
	public String toString() {
		return "" + Date_Order;
	}
}

package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class product {
	
	@Column(name="Code_Product", nullable=false, length=255,unique = true)

	@Id String Code_Product;
	public product(String Code_Product, String Name_Product, String Quantity_Product, String Quality_Product,
			String Fabrication_Date_Product, String Expire_Date_Product, String Duration_Product) {
		super();
		this.Code_Product = Code_Product;
		this.Name_Product = Name_Product;
		this.Quantity_Product = Quantity_Product;
		this.Quality_Product = Quality_Product;
		this.Fabrication_Date_Product = Fabrication_Date_Product;
		this.Expire_Date_Product = Expire_Date_Product;
		this.Duration_Product = Duration_Product;
	}
	public product() {
		
	}
	@Override
	public String toString() {
		return "" + Code_Product + "," + Name_Product + ","
				+ Quantity_Product + "," + Quality_Product + ","
				+ Fabrication_Date_Product + "," + Expire_Date_Product + ","
				+ Duration_Product + "";
	}
	@Column(name="Name_Product", nullable=false, length=255, unique = true)

	String Name_Product;
	
	@Column(name="Quantity_Product", nullable=false, length=255, unique = true)

	String  Quantity_Product;

	@Column(name="Fabrication_Date_Product", nullable=false, length=255, unique = true)

	String  Fabrication_Date_Product;
	@Column(name="Expire_Date_Product", nullable=false, length=255, unique = true)

	String Expire_Date_Product;
	@Column(name="Duration_Product", nullable=false, length=255, unique = true)

	String Duration_Product;
	
	@Column(name="Quality_Product", nullable=false, length=255, unique = true)

	String Quality_Product;

}

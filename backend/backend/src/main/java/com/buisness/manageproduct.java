package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.clientrepositry;
import com.dao.productrepositry;
import com.entity.product;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageproduct {
	@Autowired
	productrepositry podr;



	public void Create_Product (
			
			product pr) {

	   podr.save(pr);
		
		
		
	}
	
	public void Get_Product (String Code_Product) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(podr.Get_Product(Code_Product).get(0)); 
		
		
	}
	

	public void Delete_Product (
			String Code_Product) {

	   podr.Delete_Product(Code_Product);
		
		
		
	}
	

	public void Modify_Product (
			
			String Code_Product,  String Name_Product,String Quantity_Product,	String 	Quality_Product,String Fabrication_Date_Product,String Expire_Date_Product,	String 	Duration_Product) {

	   podr.Modify_Product(Code_Product,Name_Product,Quantity_Product,Quality_Product,Fabrication_Date_Product,Expire_Date_Product,Duration_Product);
		
		
		
	}
	
	

	
}

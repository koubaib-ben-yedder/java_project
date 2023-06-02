package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.orderclientrepositry;
import com.dao.orderrepositry;
import com.entity.orderclient;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageorderclient {

	@Autowired
	orderclientrepositry ocr;


	public void Create_Order_Client (
			
			orderclient oc) {
		
	   
	   ocr.save(oc);
		
		
		
	}
	
	public void Get_Order_Client (String Code_Order_Client) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(ocr.Get_Order_Client(Code_Order_Client)); 
		
		
	}
	

	public void Delete_Order_Client (
			String Code_Order_Client) {

	   ocr.Delete_Order_Client(Code_Order_Client);
		
		
		
	}
	

	public void Modify_Order_Client (
			
			String Code_Order_Client,  String Name_Order_Cient) {

	   ocr.Modify_Order_Client(Code_Order_Client,Name_Order_Cient);
		
		
		
	}
	
}

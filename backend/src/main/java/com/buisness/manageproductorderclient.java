package com.buisness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.dao.clientrepositry;
import com.dao.productorderclientrepositry;
import com.entity.client;
import com.entity.productorderclient;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageproductorderclient {
	@Autowired
	productorderclientrepositry pocr;



	public void Create_Product_Order_Client (
			
			productorderclient poc) {

		pocr.save(poc);
		
		
		
	}
	
	public void Get_Product_Order_Client (String Code_Order_Product,String Code_Order_Client,String Date_Product_Order_Client) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(pocr.Get_Product_Order_Client(Code_Order_Product,Code_Order_Client,Date_Product_Order_Client).get(0)); 
		
		
	}
	

	public void Delete_Product_Order_Client (
			String Code_Order_Product,String Code_Order_Client,String Date_Product_Order_Client) {

		pocr.Delete_Product_Order_Client(Code_Order_Product,Code_Order_Client,Date_Product_Order_Client);
		
		
		
	}
	


	
	
}

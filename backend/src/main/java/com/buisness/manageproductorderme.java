package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.productorderclientrepositry;
import com.dao.productordermerepositry;
import com.entity.productorderclient;
import com.entity.productorderme;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageproductorderme {

	@Autowired
	productordermerepositry pomr;



	public void Create_Product_Order_Me (
			
		productorderme	pom) {

		pomr.save(pom);
		
		
		
	}
	
	public void Get_Product_Order_Me (String Code_Order_Me,String Code_Product_Me,String Date_Product_Order_Me) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(pomr.Get_Product_Order_Me (Code_Order_Me,Code_Product_Me,Date_Product_Order_Me).get(0)); 
		
		
	}
	

	public void Delete_Product_Order_Me (
			String Code_Order_Me,String Code_Product_Me,String Date_Product_Order_Me) {

		pomr.Delete_Product_Order_Me(Code_Order_Me,Code_Product_Me,Date_Product_Order_Me);
		
		
		
	}
	

}

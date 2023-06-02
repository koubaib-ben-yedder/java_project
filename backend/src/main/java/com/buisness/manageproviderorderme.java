package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.clientrepositry;
import com.dao.provideordermerepositry;
import com.entity.client;
import com.entity.providerorderme;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageproviderorderme{
	
	@Autowired
	provideordermerepositry pomr;



	public void Create_Provider_Order_Me (
			
			providerorderme pom) {

		pomr.save(pom);
		
		
		
	}
	
	public void Get_Provider_Order_Me (String Code_Provider,String Code_Order_Me ,String Date_Product_Order_Me) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(pomr.Get_Provider_Order_Me( Code_Provider, Code_Order_Me , Date_Product_Order_Me).get(0)); 
		
		
	}
	

	public void Delete_Provider_Order_Me (
			String Code_Provider,String Code_Order_Me ,String Date_Product_Order_Me) {

		pomr.Delete_Provider_Order_Me(Code_Provider, Code_Order_Me , Date_Product_Order_Me);
		
		
		
	}
	


	

	
}

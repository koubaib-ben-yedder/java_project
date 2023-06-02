package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.clientrepositry;
import com.dao.providerproductrepositry;
import com.entity.client;
import com.entity.providerproduct;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageproviderproduct {
	@Autowired
	providerproductrepositry ppr;



	public void Create_Provider_Product (
			
			providerproduct pp) {

		ppr.save(pp);
		
		
		
	}
	
	public void Get_Provider_Product (String Code_Provider, String Code_Product,String Date_Provider_Product) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(ppr.Get_Provider_Product(Code_Provider, Code_Product,Date_Provider_Product).get(0)); 
		
		
	}
	

	public void Delete_Provider_Product (
			 String Code_Product,String Code_Provider,String Date_Provider_Product) {

		ppr.Delete_Provider_Product(Date_Provider_Product, Code_Product,Code_Provider);
		
		
		
	}
	

	
}

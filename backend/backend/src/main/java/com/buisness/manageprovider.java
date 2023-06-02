package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.clientrepositry;
import com.dao.providerrepositry;
import com.entity.client;
import com.entity.provider;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageprovider {
	@Autowired
	providerrepositry pr;



	public void Create_Provider (
			
			provider p) {

	   pr.save(p);
		
		
		
	}
	
	public void Get_Provider (String Code_Provider) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(pr.Get_Provider(Code_Provider).get(0)); 
		
		
	}
	

	public void Delete_Provider (
			String Code_Provider) {

	   pr.Delete_Provider(Code_Provider);
		
		
		
	}
	

	public void Modify_Provider (
			
			String Code_Provider,  String Name_Provider,String Tel_Provider,	String E_Mail_Provider) {

	   pr.Modify_Provider(Code_Provider,Name_Provider,Tel_Provider,E_Mail_Provider);
		
		
		
	}
	
	

}

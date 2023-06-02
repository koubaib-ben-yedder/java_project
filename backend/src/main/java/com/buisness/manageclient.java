package com.buisness;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.buisness.*;
import jakarta.transaction.Transactional;
import com.entity.*;
@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})

public class manageclient {
	@Autowired
	
	clientrepositry cr;




	public  void Create_Client (
			
			client cl) {

	   cr.save(cl);
		
		
		
	}
	
	public client Get_Client (String Code_Client) {
		
		System.out.println(cr.Get_Client(Code_Client).get(0));
	
	 return cr.Get_Client(Code_Client).get(0); 
		
		
	}
	

	public void Delete_Client (
			String Code_Client) {

	   cr.Delete_Client(Code_Client);
		
		
		
	}
	

	public void Modify_Client (
			
			String Code_Client,  String nameCl,String lastNameCl,	String telCl) {

	   cr.Modify_Client(Code_Client,nameCl,lastNameCl,telCl);
		
		
		
	}
	
	

	
	
	
}

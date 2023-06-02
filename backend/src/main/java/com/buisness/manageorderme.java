package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.orderMerepositry;
import com.dao.orderrepositry;
import com.entity.orderC;
import com.entity.orderme;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageorderme {
	@Autowired
	orderMerepositry omr;
public void Create_Order_Me (
			
			orderme om) {

	   omr.save(om);
		
		
		
	}
	
	public void Get_Order_Me (String Code_Order_Me) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
	
		
		System.out.println(omr.Get_Order_Me(Code_Order_Me).get(0)); 
		
		
	}
	

	public void Delete_Order_Me (
			String Code_Order_Me) {

	   omr.Delete_Order_Me(Code_Order_Me);
		
		
		
	}
	

	public void Modify_Order_Me(
			
			String Code_Order_Me,  String Name_Order_Me) {

	   omr.Modify_Order_Me(Code_Order_Me,Name_Order_Me);
		
		
		
	}
}

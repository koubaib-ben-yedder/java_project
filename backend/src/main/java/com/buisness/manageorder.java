package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.dao.orderclientrepositry;
import com.dao.orderrepositry;
import com.entity.orderC;
import com.entity.orderC;
import com.entity.orderclient;

import jakarta.transaction.Transactional;

@Service
@Transactional
@EntityScan (basePackages= {"com.entity"})
public class manageorder {
	@Autowired
	orderrepositry or;

 public void Create_Order(
			
			orderC o) {
	 
	 
	
	      or.save(o);

	 
	   
		
		
		
	}

public orderC Get_Order (String Date_Order) {

	return or.Get_Order(Date_Order).get(0);

	
	
}









	
	
}

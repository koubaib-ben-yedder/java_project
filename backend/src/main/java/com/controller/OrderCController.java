package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buisness.manageclient;
import com.buisness.manageorder;
import com.dao.clientrepositry;
import com.dao.orderrepositry;
import com.entity.client;
import com.entity.orderC;

@RestController
public class OrderCController {
	
	@Autowired
	orderrepositry or;
	@Autowired 
	manageorder mo;
	

	OrderCController(orderrepositry or) {
	    this.or = or;
	  }
	
	  @PostMapping("/orderC/post")
	  void Create_Order(@RequestBody orderC oc) {
		 mo.Create_Order(oc);
	   
	  }

	  
	  @GetMapping("/orderC/get/{id}")
	 String  Get_Order(@PathVariable String id) {
		  
		  System.out.println( mo.Get_Order(id));
	    
	   return mo.Get_Order(id).toString();
	   
	  }

}

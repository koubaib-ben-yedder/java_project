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
import com.dao.clientrepositry;
import com.entity.client;

@RestController
public class ClientController {
	
	@Autowired
	clientrepositry cr;
	@Autowired 
	manageclient mc;
	

	ClientController(clientrepositry cr) {
	    this.cr = cr;
	  }
	
	  @PostMapping("/clients/post")
	  void Create_Client(@RequestBody client cl) {
		 mc.Create_Client(cl);
	   
	  }

	  
	  @GetMapping("/clients/get/{id}")
	  client Get_Client(@PathVariable String id) {
	    
	   return mc.Get_Client(id);
	   
	  }

	  @PutMapping("/clients/modify/{id}")
	  void Modify_Client(@RequestBody client cl, @PathVariable String id) {
	    
		  mc.Modify_Client(cl.getCodeCl(),cl.getNameCl(), cl.getLastNameCl(), cl.getTelCl());
	  }

	  @DeleteMapping("/clients/delete/{id}")
	  void Delete_Client(@PathVariable String id) {
	    mc.Delete_Client(id);
	  }
}

package com.example.demo;

import java.rmi.server.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.buisness.manageclient;
import com.buisness.manageorder;
import com.buisness.manageorderclient;
import com.buisness.manageorderme;
import com.buisness.manageproduct;
import com.buisness.manageproductorderclient;
import com.buisness.manageproductorderme;
import com.buisness.manageprovider;
import com.buisness.manageproviderorderme;
import com.buisness.manageproviderproduct;
import com.controller.ClientController;
import com.dao.clientrepositry;
import com.dao.orderclientrepositry;
import com.entity.client;
import com.entity.orderC;
import com.entity.orderclient;
import com.entity.orderme;
import com.entity.product;
import com.entity.productorderclient;
import com.entity.productorderme;
import com.entity.provider;
import com.entity.providerorderme;
import com.entity.providerproduct;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@SpringBootApplication(scanBasePackages={"com.dao", "com.entity","com.buisness","com.controller"})
@ComponentScan("com.buisness")
@ComponentScan(basePackageClasses= ClientController.class)
@EntityScan("com.entity")
@EnableJpaRepositories ("com.dao")

public class Demo1Application implements CommandLineRunner{

	@Autowired (required=true)
	manageclient mc;
	@Autowired
	manageorderclient moc;
	@Autowired 
	manageorder mo;
	@Autowired 
	manageorderme mom;
	@Autowired
	manageproduct mp;
	@Autowired 
	manageproductorderclient mpoc;
	@Autowired 
	manageproductorderme mpom;
	@Autowired 
	manageprovider mpro;
	@Autowired 
	manageproviderproduct mpp;
	@Autowired 
	manageproviderorderme mpo;
	
	

	public static void main(String[] args) {

		SpringApplication.run(Demo1Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	

	
		
		//mc.Create_Client(new client("2","-","-","-"));
		//mc.Get_Client("2");
		//mc.Modify_Client("1", "*", "**", "***");
		//mc.Delete_Client("2");
		//moc.Create_Order_Client(new orderclient("*","*"));
		//moc.Delete_Order_Client("-");
		//moc.Modify_Order_Client("*", "*****");
		//mo.Create_Order(new orderC("5"));
		//mo.Get_Order("1");
		//mom.Create_Order_Me(new orderme("/","/"));
		 //mom.Delete_Order_Me("-");
		//mom.Modify_Order_Me("*", "**");
		//mp.Create_Product(new product("-", "--", "---", "----", "-----", "------", "-------"));
		//mp.Delete_Product("-");	
		//mp.Modify_Product("-", "**", "***", "****", "*****", "******", "*******");
		//mpoc.Create_Product_Order_Client(new productorderclient("-","--","--"));
		//mpoc.Delete_Product_Order_Client("--","--" , "--");
		//mpoc.Get_Product_Order_Client("--", "--", "--");
		//mpom.Create_Product_Order_Me(new productorderme("*", "**", "***"));
		//mpom.Delete_Product_Order_Me("-", "--", "---");
		//mpom.Get_Product_Order_Me("*", "**", "***");
		//mpro.Create_Provider(new provider("*","**","***","****"));
		//mpro.Delete_Provider("--");
		//mpro.Modify_Provider("**", "-", "--", "---");
		//mpp.Create_Provider_Product(new providerproduct("-","--","---"));
	    //mpp.Delete_Provider_Product("-", "--", "---");
		//mpp.Get_Provider_Product("---", "--", "-");
		//mpo.Create_Provider_Order_Me(new providerorderme("*", "**", "***"));
		//mpo.Delete_Provider_Order_Me("-", "--", "---");		
		
	}

}

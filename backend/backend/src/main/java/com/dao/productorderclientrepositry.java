package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.productorderclient;


public interface productorderclientrepositry extends JpaRepository<productorderclient, Long>{
	
	@Modifying
	@Query(value = "select * from productorderclient where Code_Order_Product =:Code_Order_Product and Code_Order_Client =:Code_Order_Client and 	Date_Product_Order_Client =:Date_Product_Order_Client", nativeQuery = true)

	public List <productorderclient> Get_Product_Order_Client (@Param("Code_Order_Product") String Code_Order_Product,@Param("Code_Order_Client") String Code_Order_Client,@Param("Date_Product_Order_Client") String Date_Product_Order_Client);
	
	@Modifying
	@Query(value = "delete  from productorderclient where Code_Order_Product =:Code_Order_Product and Code_Order_Client =:Code_Order_Client and 	Date_Product_Order_Client =:Date_Product_Order_Client", nativeQuery = true)
	
	public int Delete_Product_Order_Client (@Param("Code_Order_Product") String Code_Order_Product,@Param("Code_Order_Client") String Code_Order_Client,@Param("Date_Product_Order_Client") String Date_Product_Order_Client);

}

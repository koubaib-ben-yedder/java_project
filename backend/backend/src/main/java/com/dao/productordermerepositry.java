package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.productorderclient;
import com.entity.productorderme;
public interface productordermerepositry extends JpaRepository<productorderme, Long>{

	@Modifying
	@Query(value = "select * from productorderme where Code_Order_Me =:Code_Order_Me and Code_Product_Me =:Code_Product_Me and 	Date_Product_Order_Me =:Date_Product_Order_Me", nativeQuery = true)

	public List <productorderme> Get_Product_Order_Me (@Param("Code_Order_Me") String Code_Order_Me,@Param("Code_Product_Me") String Code_Product_Me,@Param("Date_Product_Order_Me") String Date_Product_Order_Me);
	
	@Modifying
	@Query(value = "delete  from productorderme where Code_Order_Me =:Code_Order_Me and Code_Product_Me =:Code_Product_Me and 	Date_Product_Order_Me =:Date_Product_Order_Me", nativeQuery = true)
	
	public int Delete_Product_Order_Me (@Param("Code_Order_Me") String Code_Order_Me,@Param("Code_Product_Me") String Code_Product_Me,@Param("Date_Product_Order_Me") String Date_Product_Order_Me);

}

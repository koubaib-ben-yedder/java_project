package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.client;
import com.entity.providerorderme;


public interface provideordermerepositry extends JpaRepository<providerorderme, Long> {
	
	@Modifying
	@Query(value = "select * from providerorderme where Code_Order_Me=:Code_Order_Me and Code_Provider=:Code_Provider and Date_Product_Order_Me	=:Date_Product_Order_Me	", nativeQuery = true)

	public List <providerorderme> Get_Provider_Order_Me (@Param("Code_Order_Me") String Code_Order_Me,@Param("Code_Provider") String Code_Provider,@Param("Date_Product_Order_Me") String Date_Product_Order_Me);
	@Modifying
	@Query(value = "delete  from providerorderme where Code_Provider=:Code_Provider and Code_Order_Me=:Code_Order_Me  and Date_Product_Order_Me =:Date_Product_Order_Me	", nativeQuery = true)
	
	public int Delete_Provider_Order_Me (@Param("Code_Provider") String Code_Provider,@Param("Code_Order_Me") String Code_Order_Me,@Param("Date_Product_Order_Me") String Date_Product_Order_Me);
	

}

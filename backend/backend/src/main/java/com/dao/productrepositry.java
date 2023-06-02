package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.client;
import com.entity.product;
public interface productrepositry extends JpaRepository<product, Long>{
	
	@Modifying
	@Query(value = "select * from product where 	Code_Product=:	Code_Product", nativeQuery = true)

	public List <client> Get_Product (@Param("Code_Product") String Code_Product);
	@Modifying
	@Query(value = "delete  from product where Code_Product =:Code_Product", nativeQuery = true)
	
	public int Delete_Product (@Param("Code_Product") String Code_Product);
	@Modifying
	@Query(value = "update product set   Name_Product=:Name_Product , Quantity_Product=:Quantity_Product , Quality_Product=:Quality_Product ,Fabrication_Date_Product=:Fabrication_Date_Product , Expire_Date_Product=:Expire_Date_Product , Duration_Product=:Duration_Product where Code_Product=:Code_Product", nativeQuery = true)

	public int Modify_Product (@Param("Code_Product") String Code_Product,@Param("Name_Product") String Name_Product, @Param("Quantity_Product") String Quantity_Product,@Param("Quality_Product")	String Quality_Product, @Param("Fabrication_Date_Product") String Fabrication_Date_Product,@Param("Expire_Date_Product")	String Expire_Date_Product,@Param("Duration_Product")	String Duration_Product);

}

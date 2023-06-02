package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.orderme;

public interface orderMerepositry extends JpaRepository<orderme, Long>{
	
	@Modifying
	@Query(value = "select * from orderme where Code_Order_Me=:Code_Order_Me", nativeQuery = true)

	public List <orderme> Get_Order_Me (@Param("Code_Order_Me") String Code_Order_Me);
	@Modifying
	@Query(value = "delete  from orderme where Code_Order_Me =:Code_Order_Me", nativeQuery = true)
	
	public int Delete_Order_Me (@Param("Code_Order_Me") String Code_Order_Me);
	@Modifying
	@Query(value = "update orderme set   Name_Order_Me=:Name_Order_Me where Code_Order_Me=:Code_Order_Me", nativeQuery = true)

	public int Modify_Order_Me (@Param("Code_Order_Me") String Code_Order_Me,@Param("Name_Order_Me") String Name_Order_Me);
}

package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.providerproduct;


public interface providerproductrepositry extends JpaRepository<providerproduct, Long> {
	
	@Modifying
	@Query(value = "select * from providerproduct where Code_Product=:Code_Product and Code_Provider=:Code_Provider and Date_Provider_Product=:Date_Provider_Product", nativeQuery = true)

	public List <providerproduct> Get_Provider_Product (@Param("Code_Product") String Code_Product,@Param("Code_Provider") String Code_Provider,@Param("Date_Provider_Product") String Date_Provider_Product);
	
	@Modifying
	@Query(value = "delete  from providerproduct where  Date_Provider_Product=:Date_Provider_Product and Code_Product=:Code_Product and Code_Provider=:Code_Provider", nativeQuery = true)
	
	public void Delete_Provider_Product (@Param("Date_Provider_Product") String Date_Provider_Product,@Param("Code_Product") String Code_Product,@Param("Code_Provider") String Code_Provider);
}

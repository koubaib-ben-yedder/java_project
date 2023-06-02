package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.client;
import com.entity.provider;


public interface providerrepositry extends JpaRepository<provider, Long> {
	@Modifying
	@Query(value = "select * from provider where Code_Provider=:Code_Provider", nativeQuery = true)

	public List <client> Get_Provider (@Param("Code_Provider") String Code_Provider);
	@Modifying
	@Query(value = "delete  from provider where Code_Provider =:Code_Provider", nativeQuery = true)
	
	public int Delete_Provider (@Param("Code_Provider") String Code_Provider);
	@Modifying
	@Query(value = "update provider set   Name_Provider=:Name_Provider , Tel_Provider=:Tel_Provider , E_Mail_Provider=:E_Mail_Provider where Code_Provider=:Code_Provider", nativeQuery = true)

	public int Modify_Provider (@Param("Code_Provider") String Code_Provider,@Param("Name_Provider") String Name_Provider, @Param("Tel_Provider") String Tel_Provider,@Param("E_Mail_Provider")	String E_Mail_Provider);
}

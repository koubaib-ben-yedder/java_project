package com.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.client;

public interface clientrepositry  extends JpaRepository<client, Long> {
	@Modifying
	@Query(value = "select * from client where codeCl=:Code_Client", nativeQuery = true)

	public List <client> Get_Client (@Param("Code_Client") String Code_Client);
	@Modifying
	@Query(value = "delete  from client where codeCl =:Code_Client", nativeQuery = true)
	
	public int Delete_Client (@Param("Code_Client") String Code_Client);
	@Modifying
	@Query(value = "update client set   nameCl=:nameCl , lastNameCl=:lastNameCl , telCl=:telCl where codeCl=:Code_Client", nativeQuery = true)

	public int Modify_Client (@Param("Code_Client") String Code_Client,@Param("nameCl") String nameCl, @Param("lastNameCl") String lastNameCl,@Param("telCl")	String telCl);

}
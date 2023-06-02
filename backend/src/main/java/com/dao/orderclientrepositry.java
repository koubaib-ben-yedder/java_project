package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.orderclient;

public interface orderclientrepositry extends JpaRepository<orderclient, Long>{
	@Modifying
	@Query(value = "select * from orderclient where Code_Order_Client =:Code_Order_Client", nativeQuery = true)

	public List <orderclient> Get_Order_Client (@Param("Code_Order_Client") String Code_Order_Client );
	@Modifying
	@Query(value = "delete  from orderclient where Code_Order_Client =:Code_Order_Client", nativeQuery = true)
	
	public int Delete_Order_Client (@Param("Code_Order_Client") String Code_Order_Client);
	@Modifying
	@Query(value = "update orderclient set   Name_Order_Client=:Name_Order_Client where Code_Order_Client=:Code_Order_Client", nativeQuery = true)

	public int Modify_Order_Client (@Param("Code_Order_Client") String Code_Order_Clients,@Param("Name_Order_Client") String Name_Order_Client);

}

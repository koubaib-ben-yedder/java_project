package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.orderC;
import com.entity.orderclient;
public interface orderrepositry extends JpaRepository<orderC, Long> {
	
	@Modifying
	@Query(value = "select * from orderC where Date_Order=:Date_Order", nativeQuery = true)

	public List <orderC> Get_Order (@Param("Date_Order") String Date_Order );
	@Modifying
	@Query(value = "delete  from orderC where Date_Order=:Date_Order", nativeQuery = true)
	
	public int Delete_Order (@Param("Date_Order") String Date_Order);

}

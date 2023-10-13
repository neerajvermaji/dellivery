package com.farmersmart.Delivery.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Integer> {

	public String deleteByCustomerName(String customerName);

	//public String deleteByName(String customerName);
	
}

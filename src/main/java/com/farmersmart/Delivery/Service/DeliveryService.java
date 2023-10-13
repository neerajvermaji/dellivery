package com.farmersmart.Delivery.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.Delivery.Entity.DeliveryEntity;
import com.farmersmart.Delivery.Entity.DeliveryRepository;

@Service
public class DeliveryService {
	
	private static final Logger logger = LoggerFactory.getLogger(DeliveryService.class);
	
	@Autowired
	DeliveryRepository deliveryRepository;
	

	public String addProduct(DeliveryEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		deliveryRepository.save(entity);
		return "Record has been added successfully";
	
	}
	public List<DeliveryEntity> getProductDetails() {
		// TODO Auto-generated method stub
		return deliveryRepository.findAll();
	}
	public Optional<DeliveryEntity> getProductById(int id) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(id);
	}
	public String deleteByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		String message;
		try {
		message= "deleted successfully" ;
		deliveryRepository.deleteByCustomerName(customerName);
		logger.info(message);
		}
		catch(Exception e) {
		message=" invalid id";
		logger.error(message);
		}return message;
	}

	public String updatedProduct(DeliveryEntity entity) {
		// TODO Auto-generated method stub
		deliveryRepository.save(entity);
		return "record has been updated successfully";
	}
	

	}



package com.farmersmart.Delivery.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.Delivery.Entity.DeliveryEntity;
import com.farmersmart.Delivery.Service.DeliveryService;

@RestController
public class DeliveryController {
	@Autowired
	DeliveryService deliveryService;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody DeliveryEntity entity) {
		return deliveryService.addProduct(entity);
	}
	@GetMapping("/getProductDetails")
	public List<DeliveryEntity>getProductDetails(){
		return deliveryService.getProductDetails();
	}
	@GetMapping("/getProductById")
	public Optional<DeliveryEntity> getProductById(@RequestParam int id){
		return deliveryService.getProductById(id);
	}
	@DeleteMapping("/deleteByName")
	public String deleteByName(@RequestParam String customerName){
		return deliveryService.deleteByCustomerName(customerName);
		 
	}
	@PutMapping("/updatedProduct")
	public String updatedProduct(@RequestBody DeliveryEntity entity) {
		return deliveryService.updatedProduct(entity);
	}

	
}

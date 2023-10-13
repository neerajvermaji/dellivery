package com.farmersmart.Delivery.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Delivery")
public class DeliveryEntity {

	@Id
	int id;
	int customerId;
	String customerName;
	String customerAddress;
	int productQuantity;
	
	public DeliveryEntity() {
		super();
	}

	public DeliveryEntity(int id, int customerId, String customerName, String customerAddress, int productQuantity) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.productQuantity = productQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "DeliveryEntity [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", productQuantity=" + productQuantity + "]";
	}
	
	
	
}
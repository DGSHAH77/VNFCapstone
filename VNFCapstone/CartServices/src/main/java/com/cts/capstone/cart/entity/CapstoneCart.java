package com.cts.capstone.cart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CapstoneCart {
	@Column(name="cartId")
	String cartId;
	@Column(name="userId")
	String userId;
	@Column(name="serviceId")
	String serviceID;
	@Column(name="createdDate")
	Date createdDate;
	@Id
	@Column (name="orderId")
	String orderId;
	@Column (name="status")
	String status;
	
	
	
	public CapstoneCart(String cartId, String userId, String serviceID, Date createdDate, String orderId) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.serviceID = serviceID;
		this.createdDate = createdDate;
		this.orderId = orderId;
	}

	public CapstoneCart() {
		super();
	}

	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}

package com.cropdeal.bill.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bill")  
public class Order {

	@Id
	private long orderId;
	private String orderName;
	private long cropId;
	private String cropName;
	private int userId;
	private String userName;
	private String orderPrice;
	private String orderStatus;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long orderId, String orderName, long cropId, String cropName, int userId, String userName,
			String orderPrice, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.cropId = cropId;
		this.cropName = cropName;
		this.userId = userId;
		this.userName = userName;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public long getCropId() {
		return cropId;
	}
	public void setCropId(long cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}

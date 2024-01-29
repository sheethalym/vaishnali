package com.cropdeal.bill.service;

import java.util.List;
import java.util.Optional;

import com.cropdeal.bill.entity.Order;

public interface BillService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public void deleteOrder(long orderId);
	public Optional<Order> getOrderById(long OrderId);
	public List<Order> getAllOrder();
	public Optional<Order> getOrderByOrderName(String orderName);
	//Optional<Order> getOrderByOrderName(String orderName);
}

package com.cropdeal.bill.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropdeal.bill.entity.Order;
import com.cropdeal.bill.exception.BillException;
import com.cropdeal.bill.repository.BillRepository;


@Service
public class BillServiceImp  implements BillService{
	
	@Autowired
	private BillRepository billRepository;

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return billRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		Order updateOrder = billRepository.findByOrderId(order.getOrderId()).orElseThrow(()-> new BillException("Order not found"));
		updateOrder.setOrderId(order.getOrderId());
		updateOrder.setOrderName(order.getOrderName());
		updateOrder.setCropId(order.getCropId());
		updateOrder.setCropName(order.getCropName());
		updateOrder.setUserId(order.getUserId());
		updateOrder.setUserName(order.getUserName());
		updateOrder.setOrderPrice(order.getOrderPrice());
		updateOrder.setOrderStatus(order.getOrderStatus());
		
		return updateOrder;
		
	}
	@Override
	public void deleteOrder(long orderId) {
		// TODO Auto-generated method stub
	 billRepository.deleteById(orderId);
	}

	@Override
	public Optional<Order> getOrderById(long orderId) {
		// TODO Auto-generated method stub
		return billRepository.findById(orderId);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return billRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderByOrderName(String orderName) {
		// TODO Auto-generated method stub
		return billRepository.findByOrderName(orderName);
				
	}


	
}

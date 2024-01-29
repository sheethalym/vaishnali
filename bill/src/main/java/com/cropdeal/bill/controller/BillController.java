package com.cropdeal.bill.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdeal.bill.entity.Order;
import com.cropdeal.bill.service.BillService;

@RestController
@RequestMapping("/Bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	    @PostMapping("/AddOrder")
	    public Order addOder(@RequestBody Order order) {
		return billService.addOrder(order);
	    }
		
		@GetMapping("/getAllOrder")
		public List<Order> getAllOrder() {
		return billService.getAllOrder();
		}
		
		@GetMapping("/orderId/{orderId}")
		public Optional<Order> getOrderById(@PathVariable  long orderId) {
			return billService.getOrderById(orderId);
		}
		
		@GetMapping("/orderName/{orderName}")
		public Optional<Order> getOrderByOrderName(@PathVariable String orderName) {
			return billService.getOrderByOrderName(orderName);
		}
		
		@PutMapping("/updateOrder")
		public Order updateOrder(@RequestBody Order order) {
			return billService.updateOrder(order);
		}
		
		@DeleteMapping("/deletecrop/{orderId}")
		public void deleteCropById(@PathVariable int orderId) {
			billService.deleteOrder(orderId);
		
	}
}

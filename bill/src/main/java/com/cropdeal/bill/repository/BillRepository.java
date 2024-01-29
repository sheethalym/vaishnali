package com.cropdeal.bill.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cropdeal.bill.entity.Order;

@Repository
public interface BillRepository extends MongoRepository<Order, Long>{

	Optional<Order> findByOrderId(long orderId);

	Optional<Order> findByOrderName(String orderName);

	
   
}

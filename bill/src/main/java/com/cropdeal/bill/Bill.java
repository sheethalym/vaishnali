package com.cropdeal.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class Bill {
	public static void main(String[] args) {
		SpringApplication.run(Bill.class, args);
		System.out.println("bill application started");
	}
}

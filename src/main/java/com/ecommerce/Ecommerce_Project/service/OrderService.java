package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Orders;

public interface OrderService {

	Orders placeOrder(Orders order);
	
	List<Orders> getAllOrders();
	
	List<Orders> getOrdersByUser(Long userId);
	
	Orders updateStatus(Long id, String status);
}

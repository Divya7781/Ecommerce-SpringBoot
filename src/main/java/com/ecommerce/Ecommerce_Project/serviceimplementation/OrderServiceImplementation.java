package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Orders;
import com.ecommerce.Ecommerce_Project.entity.Products;
import com.ecommerce.Ecommerce_Project.repository.OrderRepository;
import com.ecommerce.Ecommerce_Project.repository.ProductRepository;
import com.ecommerce.Ecommerce_Project.service.OrderService;

@Service
public class OrderServiceImplementation implements OrderService{
	
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;
	
	
	public OrderServiceImplementation(OrderRepository orderRepository, ProductRepository productRepository) {
		this.orderRepository = orderRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Orders placeOrder(Orders order) {
	Products products=productRepository.findById(order.getProducts().getId())
			.orElseThrow(()-> new RuntimeException("Product not found"));
	
	order.setTotalPrice(products.getPrice() * order.getQuantity());
	
	order.setStatus("Order Placed");
	
	return orderRepository.save(order);
	}

	
	
	@Override
	public List<Orders> getAllOrders() {
		
		return orderRepository.findAll();
	}

	@Override
	public List<Orders> getOrdersByUser(Long userId) {
		return orderRepository.findByUserId(userId);
	}

	@Override
	public Orders updateStatus(Long id, String status) {
		Orders order=orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order not found"));
		
		order.setStatus(status);
		
		return orderRepository.save(order);
	}

}

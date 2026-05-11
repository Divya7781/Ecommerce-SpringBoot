package com.ecommerce.Ecommerce_Project.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostMapping("/create-order")
	public String createOrder(@RequestParam Integer amount) throws Exception
	{
		JSONObject order= paymentService.createOrder(amount);
		
		return order.toString();
				
	}
	
}

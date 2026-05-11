package com.ecommerce.Ecommerce_Project.serviceimplementation;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.service.PaymentService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

@Service
public class PaymentServiceImplementation implements PaymentService{

	
	private final RazorpayClient razorpayClient;
	
	
	
	public PaymentServiceImplementation(RazorpayClient razorpayClient) {
		this.razorpayClient = razorpayClient;
	}



	@Override
	public JSONObject createOrder(Integer amount) throws Exception {
		
		JSONObject options=new JSONObject();
		
		options.put("amount", amount*100);
		options.put("currency", "INR");
		options.put("receipt", "txn_12345678");
		
		Order order=razorpayClient.orders.create(options);
		return order.toJson();
	}

}

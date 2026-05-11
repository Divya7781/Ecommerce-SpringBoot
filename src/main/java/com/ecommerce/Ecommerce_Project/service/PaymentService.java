package com.ecommerce.Ecommerce_Project.service;

import org.json.JSONObject;



public interface PaymentService {

	JSONObject createOrder(Integer amount) throws Exception;
}

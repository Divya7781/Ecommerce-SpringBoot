package com.ecommerce.Ecommerce_Project.service;

import com.ecommerce.Ecommerce_Project.entity.Admin;

public interface AdminService {

	Admin register(Admin admin);
	
	String login(String email, String password);
}

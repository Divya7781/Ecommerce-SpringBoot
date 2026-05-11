package com.ecommerce.Ecommerce_Project.service;

import com.ecommerce.Ecommerce_Project.entity.User;

public interface UserService {

	User signup(User user);

	String signin(String email, String password);
}

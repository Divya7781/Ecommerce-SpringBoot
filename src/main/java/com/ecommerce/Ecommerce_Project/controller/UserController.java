package com.ecommerce.Ecommerce_Project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.User;
import com.ecommerce.Ecommerce_Project.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.signup(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> data) {
		return userService.signin(data.get("email"), data.get("password"));
	}

}

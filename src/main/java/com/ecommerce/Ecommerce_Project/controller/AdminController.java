package com.ecommerce.Ecommerce_Project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Admin;
import com.ecommerce.Ecommerce_Project.service.AdminService;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

	private final AdminService adminService;

	public AdminController(AdminService adminService) {
		this.adminService=adminService;
	}
	
	@PostMapping("/register")
	public Admin register(@RequestBody Admin admin) {
		return adminService.register(admin);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> data) {
		return adminService.login(data.get("email"), data.get("password"));
	}
}

package com.ecommerce.Ecommerce_Project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.service.EmailService;

@RestController
@RequestMapping("api/email")
public class EmailController {

	private final EmailService emailService;

	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}
	
	
	@PostMapping
	public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
		
		emailService.sendEmail(to, subject, text);
		
		return "Email sent successfully";
	}
	
}

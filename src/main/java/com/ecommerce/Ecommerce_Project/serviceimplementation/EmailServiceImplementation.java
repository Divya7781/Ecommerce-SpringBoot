package com.ecommerce.Ecommerce_Project.serviceimplementation;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.service.EmailService;

@Service
public class EmailServiceImplementation implements EmailService{
	
	private final JavaMailSender mailSender;
	

	public EmailServiceImplementation(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}



	@Override
	public void sendEmail(String to, String subject, String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		
		mailSender.send(message);
	}

}

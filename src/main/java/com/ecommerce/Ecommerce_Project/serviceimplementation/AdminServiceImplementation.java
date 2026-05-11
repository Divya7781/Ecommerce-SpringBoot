package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Admin;
import com.ecommerce.Ecommerce_Project.repository.AdminRepository;
import com.ecommerce.Ecommerce_Project.repository.UserRepository;
import com.ecommerce.Ecommerce_Project.service.AdminService;

@Service
public class AdminServiceImplementation implements AdminService{

	private final AdminRepository adminRepository;
	private final UserRepository userRepository;
	
	public AdminServiceImplementation(AdminRepository adminRepository, UserRepository userRepository) {
		this.adminRepository=adminRepository;
		this.userRepository=userRepository;
	}

	@Override
	public Admin register(Admin admin) {
		if(adminRepository.existsByEmail(admin.getEmail())) {
			throw new RuntimeException("Admin email already exists");
		}
		return adminRepository.save(admin);
	}

	
	
	
	@Override
	public String login(String email, String password) {
		if(userRepository.existsByEmail(email)) {
			return "This email belongs to User";
		}
		
		Optional<Admin> optionalAdmin=adminRepository.findByEmail(email);
		
		if(optionalAdmin.isEmpty()) {
			return "Admin not found";
		}
		
		Admin dbAdmin=optionalAdmin.get();
		
		if(!dbAdmin.getPassword().equals(password)) {
			return "Invalid Password";
		}
		
		return "Admin login successful";
	}
	
	
	
	
}

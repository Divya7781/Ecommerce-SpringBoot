package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.User;
import com.ecommerce.Ecommerce_Project.repository.AdminRepository;
import com.ecommerce.Ecommerce_Project.repository.UserRepository;
import com.ecommerce.Ecommerce_Project.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	private final UserRepository userRepository;
	private final AdminRepository adminRepository;

	public UserServiceImplementation(UserRepository userRepository, AdminRepository adminRepository) {
		this.userRepository = userRepository;
		this.adminRepository=adminRepository;
	}

	@Override
	public User signup(User user) {
		if (userRepository.existsByEmail(user.getEmail())) {
			throw new RuntimeException("Email already exists");
		}
		return userRepository.save(user);
	}

	@Override
	public String signin(String email, String password) {
		
		if(adminRepository.existsByEmail(email)) {
			return "This email belongs to Admin";
		}
		

		Optional<User> optionalUser = userRepository.findByEmail(email);

		if (optionalUser.isEmpty()) {
			return "User not found";
		}

		User dbUser = optionalUser.get();

		if (!dbUser.getPassword().equals(password)) {
			return "Invalid Password";
		}
		return "User Login Successful";
	}

}

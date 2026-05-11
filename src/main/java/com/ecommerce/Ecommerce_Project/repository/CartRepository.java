package com.ecommerce.Ecommerce_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce_Project.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

	List<Cart> findByUserId(Long userId);
	
	void deleteByUserId(Long userId);
}

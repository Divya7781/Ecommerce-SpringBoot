package com.ecommerce.Ecommerce_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce_Project.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long>{

	List<Wishlist> findByUserId(Long userId);
	
}

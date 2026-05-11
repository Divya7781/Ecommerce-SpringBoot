package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Wishlist;

public interface WishlistService {

	Wishlist add(Wishlist wishlist);
	
	List<Wishlist> getUser(Long userId);
	
	void delete(Long id);
}

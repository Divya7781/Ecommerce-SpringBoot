package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Cart;

public interface CartService {

	Cart addToCart(Cart cart);
	
	List<Cart> getUser(Long userId);
	
	void removeItem(Long cartId);
	
	void clearCart(Long userId);
}

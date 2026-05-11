package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Cart;
import com.ecommerce.Ecommerce_Project.repository.CartRepository;
import com.ecommerce.Ecommerce_Project.service.CartService;

@Service
public class CartServiceImplementation implements CartService{

	private final CartRepository cartRepository;
	
	
	public CartServiceImplementation(CartRepository cartRepository) {
		this.cartRepository=cartRepository;
	}

	@Override
	public Cart addToCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getUser(Long userId) {
		return cartRepository.findByUserId(userId);
	}

	@Override
	public void removeItem(Long cartId) {
		cartRepository.deleteById(cartId);
		
	}

	@Override
	public void clearCart(Long userId) {
		cartRepository.deleteByUserId(userId);
		
	}

	
}

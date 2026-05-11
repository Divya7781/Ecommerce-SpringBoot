package com.ecommerce.Ecommerce_Project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Cart;
import com.ecommerce.Ecommerce_Project.service.CartService;

@RestController
@RequestMapping("/api/carts")
public class CartController {

	private final CartService cartService;

	public CartController(CartService cartService) {
		this.cartService=cartService;
	}
	
	@PostMapping
	public Cart add(@RequestBody Cart cart) {
		return cartService.addToCart(cart);
	}
	
	@GetMapping("{userId}")
	public List<Cart> getCart(@PathVariable Long userId) {
		return cartService.getUser(userId);
	}
	
	@DeleteMapping("/item/{cartId}")
	public String remove(@PathVariable Long cartId) {
		cartService.removeItem(cartId);
		return "Item removed from cart";
	}
	
	@DeleteMapping("/clear/{userId}")
	public String clear(@PathVariable Long userId) {
		cartService.clearCart(userId);
		return "Cart cleared";
	}
}

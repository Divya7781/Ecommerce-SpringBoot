package com.ecommerce.Ecommerce_Project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Wishlist;
import com.ecommerce.Ecommerce_Project.service.WishlistService;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

	private final WishlistService wishlistService;

	public WishlistController(WishlistService wishlistService) {
		this.wishlistService = wishlistService;
	}
	
	@PostMapping
	public Wishlist add(@RequestBody Wishlist wishlist) {
		return wishlistService.add(wishlist);
	}
	
	@GetMapping("/{userId}")
	public List<Wishlist> get(@PathVariable Long userId){
		return wishlistService.getUser(userId);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable Long id) {
		wishlistService.delete(id);
		return "Removed from wishlist";
	}
	
}

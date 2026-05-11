package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Wishlist;
import com.ecommerce.Ecommerce_Project.repository.ProductRepository;
import com.ecommerce.Ecommerce_Project.repository.UserRepository;
import com.ecommerce.Ecommerce_Project.repository.WishlistRepository;
import com.ecommerce.Ecommerce_Project.service.WishlistService;

@Service
public class WishlistServiceImplementation implements WishlistService {

	private final WishlistRepository wishlistRepository;
	private final UserRepository userRepository;
	private final ProductRepository productRepository;
	
	public WishlistServiceImplementation(WishlistRepository wishlistRepository, UserRepository userRepository,
			ProductRepository productRepository) {
		super();
		this.wishlistRepository = wishlistRepository;
		this.userRepository = userRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Wishlist add(Wishlist wishlist) {
	
		Long userId=wishlist.getUser().getId();
		Long productId=wishlist.getProducts().getId();
		
		if(!userRepository.existsById(userId)) {
			throw new RuntimeException("User not found");
		}
		if(!productRepository.existsById(productId)) {
			throw new RuntimeException("Product not found");
		}
		return wishlistRepository.save(wishlist);
	}

	@Override
	public List<Wishlist> getUser(Long userId) {
		return wishlistRepository.findByUserId(userId);
	}

	@Override
	public void delete(Long id) {
		wishlistRepository.deleteById(id);
		
	}

}

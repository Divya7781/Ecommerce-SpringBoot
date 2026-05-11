package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Reviews;
import com.ecommerce.Ecommerce_Project.repository.ReviewsRepository;
import com.ecommerce.Ecommerce_Project.service.ReviewsService;

@Service
public class ReviewsServiceImplementation implements ReviewsService {

	private final ReviewsRepository reviewsRepository;
	
		
	public ReviewsServiceImplementation(ReviewsRepository reviewsRepository) {
		this.reviewsRepository = reviewsRepository;
	}

	@Override
	public Reviews add(Reviews reviews) {
		return reviewsRepository.save(reviews);
	}

	@Override
	public List<Reviews> getProduct(Long productId) {
		return reviewsRepository.findByProductsId(productId);
	}

	@Override
	public void delete(Long id) {
		reviewsRepository.deleteById(id);
		
	}

	@Override
	public Double average(Long productId) {
		return reviewsRepository.getAverageRating(productId);
	}

	
}

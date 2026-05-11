package com.ecommerce.Ecommerce_Project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Reviews;
import com.ecommerce.Ecommerce_Project.service.ReviewsService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {

	private final ReviewsService reviewsService;

	public ReviewsController(ReviewsService reviewsService) {
		super();
		this.reviewsService = reviewsService;
	}
	
	@PostMapping
	public Reviews add(@RequestBody Reviews reviews) {
		return reviewsService.add(reviews);
	}
	
	
	@GetMapping("/{productId}")
	public List<Reviews> get(@PathVariable Long productId) {
		return reviewsService.getProduct(productId);
	}
	
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		reviewsService.delete(id);
		return "Review deleted successfully";
	}
	
	@GetMapping("/average/{productId}")
	public Double average(@PathVariable Long productId) {
		return reviewsService.average(productId);
	}
	
	
	
	
	
	
	
	
	
}

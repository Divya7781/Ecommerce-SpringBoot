package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Reviews;

public interface ReviewsService {

	Reviews add(Reviews reviews);
	
	List<Reviews> getProduct(Long productId);
	
	void delete(Long id);
	
	Double average(Long productId);
}

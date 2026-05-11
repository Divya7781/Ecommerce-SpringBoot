package com.ecommerce.Ecommerce_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.Ecommerce_Project.entity.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, Long>{

	List<Reviews> findByProductsId(Long productId);
	
	@Query("select avg(r.rating) from Reviews r where r.products.id = ?1")
			
			Double getAverageRating(Long productId);
}

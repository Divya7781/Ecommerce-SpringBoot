package com.ecommerce.Ecommerce_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce_Project.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

	List<Products> findByName(String name);

	List<Products> findByCategories_Id(Long categoryId);
}

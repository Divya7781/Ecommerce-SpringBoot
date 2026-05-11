package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Products;

public interface ProductService {

	Products saveProducts(Products products);

	List<Products> getAllProducts();

	Products getProductById(Long id);

	void deleteProductById(Long id);

	void deleteAllProducts();

	// update product
	Products updateProducts(Long id, Products products);

	List<Products> searchByName(String name);

	List<Products> getByCategory(Long categoryId);
}

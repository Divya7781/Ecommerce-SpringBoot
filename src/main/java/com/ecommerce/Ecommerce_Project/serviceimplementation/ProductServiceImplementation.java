package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Products;
import com.ecommerce.Ecommerce_Project.repository.ProductRepository;
import com.ecommerce.Ecommerce_Project.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService {

	private final ProductRepository productRepository;

	public ProductServiceImplementation(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Products saveProducts(Products products) {
		return productRepository.save(products);
	}

	@Override
	public List<Products> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Products getProductById(Long id) {
		return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);

	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAll();

	}

	@Override
	public Products updateProducts(Long id, Products products) {
		Products dbProduct = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not fdound"));

		dbProduct.setName(products.getName());
		dbProduct.setDescription(products.getDescription());
		dbProduct.setPrice(products.getPrice());
		dbProduct.setStock(products.getStock());
		dbProduct.setImageUrl(products.getImageUrl());
		dbProduct.setCategories(products.getCategories());

		return productRepository.save(dbProduct);
	}

	@Override
	public List<Products> searchByName(String name) {

		return productRepository.findByName(name);
	}

	@Override
	public List<Products> getByCategory(Long categoryId) {

		return productRepository.findByCategories_Id(categoryId);
	}

}

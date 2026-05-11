package com.ecommerce.Ecommerce_Project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Products;
import com.ecommerce.Ecommerce_Project.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public Products save(@RequestBody Products products) {
		return productService.saveProducts(products);
	}

	@GetMapping
	public List<Products> getAll() {
		return productService.getAllProducts();
	}

	@GetMapping("/{id}")
	public Products getById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "Category deleted successfully";
	}

	@DeleteMapping("/all")
	public String deleteAll() {
		productService.deleteAllProducts();
		return "deleted all categories successfully";
	}

	@PutMapping("/{id}")
	public Products update(@PathVariable Long id, @RequestBody Products products) {
		return productService.updateProducts(id, products);
	}

	@GetMapping("/search/{name}")
	public List<Products> search(@PathVariable String name) {
		return productService.searchByName(name);
	}

	@GetMapping("/category/{categoryId}")
	public List<Products> byCategory(@PathVariable Long categoryId) {
		return productService.getByCategory(categoryId);
	}
}

package com.ecommerce.Ecommerce_Project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce_Project.entity.Categories;
import com.ecommerce.Ecommerce_Project.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryController {

	private final CategoryService service;

	public CategoryController(CategoryService service) {
		this.service = service;
	}

	@PostMapping
	public Categories save(@RequestBody Categories categories) {
		return service.saveCategories(categories);
	}

	@GetMapping
	public List<Categories> getAll() {
		return service.getAllCategories();
	}

	@GetMapping("/{id}")
	public Categories getById(@PathVariable Long id) {
		return service.getCategoriesById(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.deleteCategories(id);
		return "Category deleted successfully";
	}

	@DeleteMapping("/all")
	public String deleteAll() {
		service.deleteAllCategories();
		return "deleted all categories successfully";
	}
}

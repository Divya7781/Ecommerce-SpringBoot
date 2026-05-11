package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce_Project.entity.Categories;
import com.ecommerce.Ecommerce_Project.repository.Repository;
import com.ecommerce.Ecommerce_Project.service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService {

	private final Repository repository;

	public CategoryServiceImplementation(Repository repository) {
		this.repository = repository;
	}

	@Override
	public Categories saveCategories(Categories categories) {

		return repository.save(categories);
	}

	@Override
	public List<Categories> getAllCategories() {

		return repository.findAll();
	}

	@Override
	public Categories getCategoriesById(Long id) {

		return repository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public void deleteCategories(Long id) {
		repository.deleteById(id);

	}

	@Override
	public void deleteAllCategories() {
		repository.deleteAll();
	}

}

package com.ecommerce.Ecommerce_Project.service;

import java.util.List;

import com.ecommerce.Ecommerce_Project.entity.Categories;

public interface CategoryService {

	Categories saveCategories(Categories categories);

	List<Categories> getAllCategories();

	Categories getCategoriesById(Long id);

	void deleteCategories(Long id);

	void deleteAllCategories();
}

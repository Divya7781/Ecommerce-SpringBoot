package com.ecommerce.Ecommerce_Project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce_Project.entity.Categories;

public interface Repository extends JpaRepository<Categories, Long> {

	Optional<Categories> findByName(String name);

	void deleteById(Long id);

	Optional<Categories> findById(Long id);
}

package com.ecommerce.Ecommerce_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce_Project.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

	List<Orders> findByUserId(Long userId);
}

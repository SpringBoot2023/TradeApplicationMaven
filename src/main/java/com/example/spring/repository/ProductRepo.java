package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.spring.model.Product;

public interface ProductRepo extends JpaRepository<Product , Long>{

	@Query("select p from Product p where p.productCode = :prodCode")
	Product findByProduct(@Param(value="prodCode") String productCode);
}

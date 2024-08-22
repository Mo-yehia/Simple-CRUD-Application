package com.Simple.CRUD.Application.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Simple.CRUD.Application.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

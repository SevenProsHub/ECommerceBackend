package com.example.ecommerce.repository;


import com.example.ecommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

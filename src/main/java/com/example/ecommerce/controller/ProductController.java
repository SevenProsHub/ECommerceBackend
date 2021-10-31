package com.example.ecommerce.controller;

import com.example.ecommerce.services.ProductService;
import com.example.ecommerce.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/p")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public Iterable<Product> findAll(){
        return productService.findAll();
    }
}

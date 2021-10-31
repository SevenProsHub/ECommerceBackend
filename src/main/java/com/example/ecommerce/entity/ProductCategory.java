package com.example.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "product_categories")
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String info;

    @OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
    private Set<Product> products = new HashSet<>();

//    @OneToOne
//    private ProductCategory parentProductCategory;
}

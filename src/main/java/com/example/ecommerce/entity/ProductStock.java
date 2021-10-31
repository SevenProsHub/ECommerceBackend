package com.example.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer pincode;

    private Integer stock;
}

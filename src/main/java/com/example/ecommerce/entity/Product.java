package com.example.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long cost;

    @Column
    private String name;

    @Column
    private String info;

    @Column(name = "available_at")
    private Date availbleAt;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory category;

    @ManyToOne
    @JoinColumn(name = "saler_id")
    private User saler;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<Order> orders = new HashSet<>();
}

package com.example.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "product_assets")
@Data
public class ProductAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @Column(name = "preview_url")
    private String previewUrl;

    private String type;

    private Integer sequence;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

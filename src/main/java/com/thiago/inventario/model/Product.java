package com.thiago.inventario.model;


import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long stock;
    private String name;
    private  String description;
    private String category;
    private double price;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;


    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}

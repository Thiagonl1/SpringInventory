package com.thiago.inventario.repository;

import com.thiago.inventario.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.thiago.inventario.service;


import com.thiago.inventario.model.Product;
import com.thiago.inventario.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public void increaseStock(Long id, int cantidad) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setStock(product.getStock() + cantidad);
        productRepository.save(product);
    }

    public void decreaseStock(Long id, int cantidad) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getStock() < cantidad) {
            throw new RuntimeException("Insufficient stock");
        }

        product.setStock(product.getStock() - cantidad);
        productRepository.save(product);
    }


}

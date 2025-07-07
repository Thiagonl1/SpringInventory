package com.thiago.inventario.repository;

import com.thiago.inventario.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository <Provider, Long>{
}

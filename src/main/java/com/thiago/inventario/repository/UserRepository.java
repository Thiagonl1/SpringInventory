package com.thiago.inventario.repository;

import com.thiago.inventario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{
}

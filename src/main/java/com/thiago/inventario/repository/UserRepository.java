package com.thiago.inventario.repository;

import com.thiago.inventario.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <AppUser, Integer>{
}

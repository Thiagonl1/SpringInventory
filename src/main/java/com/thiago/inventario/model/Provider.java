package com.thiago.inventario.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Provider {
    @Id
    private long id;
    private String name;
    private String contact;
    private String email;
}

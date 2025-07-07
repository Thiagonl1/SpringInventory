package com.thiago.inventario.model;

import jakarta.persistence.*;

@Entity
public class InventoryMovement {



    @Id
    private long id;
    private String type;
    private int quantity;
    private  String date;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}

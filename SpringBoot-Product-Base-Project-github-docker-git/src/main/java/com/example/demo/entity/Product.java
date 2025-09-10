package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Product2")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "pname", nullable = false)
    private String pname;

    @Column(name = "price", nullable = false)
    private double price;

    public Product() {}

    public Product(int id, String pname, double price) {
        this.id = id;
        this.pname = pname;
        this.price = price;
    }

    // Getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

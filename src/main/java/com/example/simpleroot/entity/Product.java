package com.example.simpleroot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    private int id;
    private String name;
    private double price;
    private  int quantity;

}

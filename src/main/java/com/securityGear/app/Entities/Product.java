package com.securityGear.app.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor //generate all arguments constructor
@NoArgsConstructor  // to generate a default constructor
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int quantity;


}

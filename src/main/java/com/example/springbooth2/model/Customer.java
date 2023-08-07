package com.example.springbooth2.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  id;
    private String name;
    private String dept;
    private double investment;
}

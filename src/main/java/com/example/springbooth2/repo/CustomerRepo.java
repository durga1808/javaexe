package com.example.springbooth2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbooth2.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    
}

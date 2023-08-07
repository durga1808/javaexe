package com.example.springbooth2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbooth2.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

    List<Customer> findByDept(String dept);

    Optional<Customer> findById(Long id);
    
}

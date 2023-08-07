package com.example.springbooth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbooth2.model.Customer;
import com.example.springbooth2.repo.CustomerRepo;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepo repo;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        repo.save(customer);
        return "Customer saved...";
    }

    @GetMapping("/AllCustomer")
    public List<Customer> getAll(){
        return repo.findAll();
    }
}

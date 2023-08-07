package com.example.springbooth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    
     @GetMapping("/findCustomer/{dept}")
   public List<Customer> getCustomerByDept(@RequestParam String dept) {
      return repo.findByDept(dept);
   }

    // @PutMapping("/updateCustomer/{id}")
    // public String updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
    //     // Check if the customer with the given ID exists
    //     Customer existingCustomer = repo.findById(id).orElse(null);
    //     if (existingCustomer == null) {
    //         return "Customer not found";
    //     }

    //     // Update the existing customer with the new details
    //     existingCustomer.setName(updatedCustomer.getName());
    //     existingCustomer.setDept(updatedCustomer.getDept());

    //     // Save the updated customer
    //     repo.save(existingCustomer);

    //     return "Customer updated successfully";
    // }

    // @DeleteMapping("/deleteCustomer/{id}")
    // public String deleteCustomer(@PathVariable Long id) {
    //     // Check if the customer with the given ID exists
    //     Customer existingCustomer = repo.findById(id).orElse(null);
    //     if (existingCustomer == null) {
    //         return "Customer not found";
    //     }

    //     // Delete the customer
    //     repo.delete(existingCustomer);

    //     return "Customer deleted successfully";
    // }
}

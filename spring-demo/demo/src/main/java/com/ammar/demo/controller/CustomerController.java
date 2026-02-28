package com.ammar.demo.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*
;


import com.ammar.demo.model.Customer;
import com.ammar.demo.service.CustomerService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@Valid @RequestBody  Customer customer) {
        return service.create(customer);
    }

    @GetMapping 
    public List<Customer> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        Customer customer = service.getById(id);

        if (customer == null) {
            throw new RuntimeException("Customer not found");
        }

        return customer;
    }

    @PutMapping  
    public Customer update(@RequestBody Customer customer) {
        return service.update(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

package com.ammar.demo.service;

import com.ammar.demo.dto.CustomerRequest;
import com.ammar.demo.dto.CustomerResponse;
import com.ammar.demo.model.Customer;
import com.ammar.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerResponse create(CustomerRequest request) {

        Customer customer = new Customer();

        customer.setName(request.getName());
        customer.setEmail(request.getEmail());

        Customer saved = repository.save(customer);

        return new CustomerResponse(
                saved.getId(),
                saved.getName(),
                saved.getEmail());
    }

    public List<CustomerResponse> getAll() {

        return repository.findAll()
                .stream()
                .map(customer -> new CustomerResponse(
                        customer.getId(),
                        customer.getName(),
                        customer.getEmail()))
                .collect(Collectors.toList());
    }

    public CustomerResponse getById(Long id) {

        Customer customer = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        return new CustomerResponse(
                customer.getId(),
                customer.getName(),
                customer.getEmail());
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
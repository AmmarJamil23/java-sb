package com.ammar.demo.repository;
import com.ammar.demo.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class CustomerRepository {

    private Map<Long, Customer> database = new HashMap<>();

    public Customer save(Customer customer) {
        database.put(customer.getId(), customer);
        return customer;
    }

    public List<Customer> findAll() {
        return new ArrayList<>(database.values());
    }

    public Customer findById(Long id) {
        return database.get(id);
    }

    public void delete(Long id) {
        database.remove(id);
    }
    
}

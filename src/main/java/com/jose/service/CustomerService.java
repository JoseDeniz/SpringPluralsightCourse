package com.jose.service;

import com.jose.model.Customer;
import com.jose.repository.CustomerRepository;

import java.util.List;

public class CustomerService implements Service {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

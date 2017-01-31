package com.jose.service;

import com.jose.model.Customer;
import com.jose.repository.HibernateCustomerRepository;

import java.util.List;

public class CustomerService implements Service {
    @Override
    public List<Customer> findAll() {
        return new HibernateCustomerRepository().findAll();
    }
}

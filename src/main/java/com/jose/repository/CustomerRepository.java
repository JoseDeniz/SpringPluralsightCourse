package com.jose.repository;

import com.jose.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

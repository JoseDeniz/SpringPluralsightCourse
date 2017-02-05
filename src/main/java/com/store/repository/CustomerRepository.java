package com.store.repository;

import com.store.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

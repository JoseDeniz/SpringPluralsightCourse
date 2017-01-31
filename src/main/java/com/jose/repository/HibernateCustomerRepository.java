package com.jose.repository;

import com.jose.model.Customer;

import java.util.List;

import static java.util.Arrays.asList;

public class HibernateCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        return asList(new Customer("Jose", "Deniz"));
    }

}

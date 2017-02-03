package com.jose.repository;

import com.jose.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;

@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        return asList(new Customer("Jose", "Deniz"));
    }

}

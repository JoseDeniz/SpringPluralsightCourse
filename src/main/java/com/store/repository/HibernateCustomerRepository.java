package com.store.repository;

import com.store.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;

@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        return asList(new Customer("Jose", "Deniz"));
    }

}

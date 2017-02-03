package com.jose;

import com.jose.repository.CustomerRepository;
import com.jose.repository.HibernateCustomerRepository;
import com.jose.service.CustomerService;
import com.jose.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("main")
public class AppConfig {

    @Bean(name = "customerRepository")
    public CustomerRepository customerRepository() {
        return new HibernateCustomerRepository();
    }

    @Bean(name = "customerService")
    public CustomerService customerService() {
        return new CustomerServiceImpl(customerRepository());
    }
}

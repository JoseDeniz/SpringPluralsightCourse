package com.jose;

import com.jose.service.CustomerService;

public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        System.out.println(customerService.findAll());
    }
}

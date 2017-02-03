package com.jose;

import com.jose.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerServiceImpl customerService = appContext.getBean("customerService", CustomerServiceImpl.class);

        System.out.println(customerService.findAll());
    }
}

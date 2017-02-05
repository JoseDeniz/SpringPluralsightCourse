package com.store;

import com.store.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerServiceImpl customerService = appContext.getBean("customerService", CustomerServiceImpl.class);

        System.out.println(customerService.findAll());
    }
}

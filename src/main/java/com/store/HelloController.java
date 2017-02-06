package com.store;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController("helloController")
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(method = GET, path = "/", name = "home")
    public String home() {
        return "Hello World";
    }

}

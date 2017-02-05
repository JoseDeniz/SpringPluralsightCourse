package com.jose;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("main")
@ComponentScan({"com.jose"})
@PropertySource("app.properties")
public class AppConfig {

}

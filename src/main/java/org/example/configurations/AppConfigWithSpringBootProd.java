package org.example.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
public class AppConfigWithSpringBootProd {

    @Value("${spring.name}")
    private String name;
}

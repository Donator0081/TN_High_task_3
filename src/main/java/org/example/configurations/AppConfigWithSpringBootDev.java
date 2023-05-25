package org.example.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties("application.yaml")
public class AppConfigWithSpringBootDev {
    private String name;
}

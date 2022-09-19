package com.example.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.example.beans",
        "com.example.example.implementation",
        "com.example.example.service"})
public class ProjectConfig {

}

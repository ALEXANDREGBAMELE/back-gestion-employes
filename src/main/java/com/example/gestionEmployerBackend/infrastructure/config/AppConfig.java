package com.example.gestionEmployerBackend.infrastructure.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
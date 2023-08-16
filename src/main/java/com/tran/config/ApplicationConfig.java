package com.tran.config;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration


@EnableJpaRepositories(basePackages = "com.tran.repositories")

@EntityScan(basePackages = "com.tran.model")
public class ApplicationConfig {
    
}

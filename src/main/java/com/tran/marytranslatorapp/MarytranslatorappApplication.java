package com.tran.marytranslatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.tran")
public class MarytranslatorappApplication {


	public static void main(String[] args) {
		SpringApplication.run(MarytranslatorappApplication.class, args);
	}

}

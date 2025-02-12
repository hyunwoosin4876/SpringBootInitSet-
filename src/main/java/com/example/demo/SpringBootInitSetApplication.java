package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example")
@ComponentScan(basePackages = "com.example")
@EnableAutoConfiguration
public class SpringBootInitSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitSetApplication.class, args);
	}

}

package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example.demo")
public class TradeApplicationMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeApplicationMavenApplication.class, args);
	}

}
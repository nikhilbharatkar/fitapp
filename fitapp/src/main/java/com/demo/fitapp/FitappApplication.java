package com.demo.fitapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@PropertySource("resource.properties")
public class FitappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitappApplication.class, args);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getResolver() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

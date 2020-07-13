package com.project.ikeademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IkeaDemoApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(IkeaDemoApplication.class, args);
	}

	
	/*
	private static final Logger log = LoggerFactory.getLogger(IkeaDemoApplication.class);
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Values quote = restTemplate.getForObject(
					"https://api.ikea-status.dong.st/prod/locations", Values.class);
			log.info(quote.toString());
		};
	} */
}

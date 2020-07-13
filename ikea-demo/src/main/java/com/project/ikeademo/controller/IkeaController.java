package com.project.ikeademo.controller;

import java.time.LocalDateTime;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.ikeademo.Values;

@RestController
public class IkeaController {
	
    
	@GetMapping("/getPacket")
	public String sayHello() {
		RestTemplate restTemplate = new RestTemplate();
		Values load = restTemplate.getForObject(
				"https://api.ikea-status.dong.st/prod/locations", Values.class);
		
		return load.toString();
	}
	

	@GetMapping("/getPacketJSON")
	public Values sayHello1() {
		RestTemplate restTemplate = new RestTemplate();
		Values load = restTemplate.getForObject(
				"https://api.ikea-status.dong.st/prod/locations", Values.class);
		return load;
	}
}

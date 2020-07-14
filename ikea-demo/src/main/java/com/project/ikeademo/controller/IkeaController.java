package com.project.ikeademo.controller;


import java.util.Date;
import java.util.Map;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.ikeademo.Locations;
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
	
	
	@GetMapping("/trail")
	public Values sayHello2() {
		
		Values load = new Values();
		load.setStatusCode("200");
		Locations[] locs = new Locations[1];
		locs[0] = new Locations();
	//	locs[0].setUpdateAt(new Date());
		load.setLocations(locs);
		
		return load;
	}
	
	
	@GetMapping("/getPacket1")
	public Values sayHello3() {
		
		RestTemplate restTemplate = new RestTemplate();
		/*		
//		Values load = restTemplate.getForObject(
//				"https://api.ikea-status.dong.st/prod/locations", Values.class);
//		
		JsonParser springParser = JsonParserFactory.getJsonParser();
		Map<String, Object> map = springParser.parseMap(restTemplate.getForObject("https://api.ikea-status.dong.st/prod/locations", String.class));
		System.out.println(map.get("locations"));
		*/
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(restTemplate.getForObject("https://api.ikea-status.dong.st/prod/locations", String.class), Values.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
		return null;
	}

	@GetMapping("/getPacketJSON")
	public Values sayHello1() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Values load = restTemplate.getForObject(
				"https://api.ikea-status.dong.st/prod/locations", Values.class);
		
		
		/*
		JsonParser springParser = JsonParserFactory.getJsonParser();
		Map<String, Object> map = springParser.parseMap(restTemplate.getForObject("https://api.ikea-status.dong.st/prod/locations", String.class));
		*/
		
		
		
		return load;
	}
}

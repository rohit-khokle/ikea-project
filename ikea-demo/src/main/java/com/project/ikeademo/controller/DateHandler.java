package com.project.ikeademo.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateHandler extends StdDeserializer<Date> {

	public DateHandler() {
		this(null);
	}	


	public DateHandler(Class<?> clazz) {
		super(clazz);
	}	
	
	
	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		String date = p.getText();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");  //yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			return sdf.parse(date);
		}
		
		catch(Exception e){
			return null;
		}
		
	}

}

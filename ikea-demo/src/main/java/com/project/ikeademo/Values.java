package com.project.ikeademo;

import java.util.Arrays;

public class Values {
	String statusCode;
	Locations[] locations;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Locations[] getLocations() {
		return locations;
	}
	public void setLocations(Locations[] loctions) {
		this.locations = loctions;
	}
	@Override
	public String toString() {
		return "Values [statusCode=" + statusCode + ", loctions=" + Arrays.toString(locations) + "]";
	}
	public Values() {
	
	}
	
	
	
	

}

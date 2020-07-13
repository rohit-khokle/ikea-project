package com.project.ikeademo.controller;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateHandler {

	
	@JsonFormat(pattern = "yyy-MM-dd HH:mm:ss")
	private LocalDate updatedOn;

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
}

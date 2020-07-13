package com.project.ikeademo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Locations {
	String iso3166;
	String countryCode;
	@JsonFormat(pattern="yyyy-MM-dd")
	Date  updateAt;
	String locationName;
	String status;
	String timezone;
	String subdivisionCode;
	Changes[] changes;
	public String getIso3166() {
		return iso3166;
	}
	public void setIso3166(String iso3166) {
		this.iso3166 = iso3166;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getSubdivisionCode() {
		return subdivisionCode;
	}
	public void setSubdivisionCode(String subdivisionCode) {
		this.subdivisionCode = subdivisionCode;
	}
	public Changes[] getChanges() {
		return changes;
	}
	public void setChanges(Changes[] changes) {
		this.changes = changes;
	}
	@Override
	public String toString() {
		return "Locations [iso3166=" + iso3166 + ", countryCode=" + countryCode + ", updateAt=" + updateAt
				+ ", locationName=" + locationName + ", status=" + status + ", timezone=" + timezone
				+ ", subdivisionCode=" + subdivisionCode + ", changes=" + Arrays.toString(changes) + "]";
	}

	public Locations(){
		
		
	}
	
}

package com.project.ikeademo;

public class Changes {
	String newStatus;
	String localTimeStamp;
	
	public Changes() {}
	
	public String getNewStatus() {
		return newStatus;
	}
	
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	
	public String getLocalTimeStamp() {
		return localTimeStamp;
	}
	
	
	public void setLocalTimeStamp(String localTimeStamp) {
		this.localTimeStamp = localTimeStamp;
	}
	
	
	@Override
	public String toString() {
		return "Changes [newStatus=" + newStatus + ", localTimeStamp=" + localTimeStamp + "]";
	}
	

}

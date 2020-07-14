package com.project.ikeademo;


public class Changes {
	String newStatus;
	
	String localTimestamp;
	
	public Changes() {}
	
	public String getNewStatus() {
		return newStatus;
	}
	
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	
	public String getLocalTimeStamp() {
		return localTimestamp;
	}
	
	
	public void setlocalTimestamp(String localTimestamp) {
		this.localTimestamp = localTimestamp;
	}
	
	
	@Override
	public String toString() {
		return "Changes [newStatus=" + newStatus + ", localTimeStamp=" + localTimestamp + "]";
	}
	

}

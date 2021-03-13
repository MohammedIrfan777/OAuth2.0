package com.prokarma.productcatalogue.exception;

import java.util.Date;

public class ErrorDetails {
	public Date timestamp;
	public String message;
	public String details;
		
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	

}
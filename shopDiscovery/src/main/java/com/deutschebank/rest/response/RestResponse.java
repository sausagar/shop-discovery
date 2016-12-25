package com.deutschebank.rest.response;

import org.springframework.http.HttpStatus;

public class RestResponse {
	
    protected HttpStatus status;
	protected String messgae;
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public String getMessgae() {
		return messgae;
	}
	
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	 
	 
}

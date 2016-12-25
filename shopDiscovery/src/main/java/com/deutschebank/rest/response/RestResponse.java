package com.deutschebank.rest.response;

import org.springframework.http.HttpStatus;

import com.deutschebank.entities.Entity;

public class RestResponse {
	
    protected HttpStatus status;
	protected String messgae;
	protected Entity entity;
	
	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

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

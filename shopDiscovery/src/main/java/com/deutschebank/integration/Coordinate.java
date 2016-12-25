package com.deutschebank.integration;

/**
 * @author Saurabh.Sagar
 *
 */
public class Coordinate {
     private Double lat;
     private Double log;
    
     
     
	public Coordinate(Double lat, Double log) {
		super();
		this.lat = lat;
		this.log = log;
	}


	public Double getLat() {
		return lat;
	}
	
	
	public Double getLog() {
		return log;
	}
	 
     
}

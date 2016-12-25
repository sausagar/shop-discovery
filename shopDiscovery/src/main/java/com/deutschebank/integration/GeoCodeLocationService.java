package com.deutschebank.integration;

import org.json.JSONObject;

import com.deutschebank.rest.exception.SDTechnicalException;

/**
 * @author Saurabh.Sagar
 *
 */
public interface GeoCodeLocationService {
    
	/**
     * @param address
     * @return
     * 
     * This will fetch the address detail from goecode service provider
     * like Google.
	 * @throws SDTechnicalException 
     * 
     * 
     */
    public JSONObject getResponseForAddress(String address) throws SDTechnicalException;

	public Coordinate getCoordinatesForAddress(String addr) throws SDTechnicalException;
}

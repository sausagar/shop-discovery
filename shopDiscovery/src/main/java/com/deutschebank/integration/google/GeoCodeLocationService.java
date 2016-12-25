package com.deutschebank.integration.google;

import org.json.JSONObject;

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
     * 
     * 
     */
    public JSONObject getResponseForAddress(String address);
}

package com.deutschebank.integration.google;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.deutschebank.integration.Coordinate;
import com.deutschebank.integration.GeoCodeLocationService;
import com.deutschebank.rest.exception.SDTechnicalException;

/**
 * @author Saurabh.Sagar
 *  This is the Google Geocode API implementation for GeoCodeLocationService
 *
 */
@Service
@PropertySource("classpath:google.properties")
public class GoogleGeocodeLocatorService implements GeoCodeLocationService{

	@Value("${geocode-api-uri}")
	private String geocodeURI;
	
	@Override
	public JSONObject getResponseForAddress(String encodedAddr) throws SDTechnicalException {

		HttpGet httpGet = new HttpGet(geocodeURI + encodedAddr
				);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpResponse response;
		StringBuilder stringBuilder = new StringBuilder();

		try {
			response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			int b;
			while ((b = stream.read()) != -1) {
				stringBuilder.append((char) b);
			}
		} catch (ClientProtocolException e) {
		} catch (IOException e) {
		}
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(stringBuilder.toString());

		} catch (Exception e) {
			throw new SDTechnicalException("Unable to parse JSON from Google Geocoding API", e);
		}
		return jsonObject;

	}
	
	@Override
	public Coordinate getCoordinatesForAddress(String addr) throws SDTechnicalException {
		JSONObject jsonObj = getResponseForAddress(addr);
		JSONArray jsonArr = jsonObj.getJSONArray("results");
		if(jsonArr == null || jsonArr.length() == 0) {
			throw new SDTechnicalException("no result found for this address");
		}
		// Considering the first result only
		jsonObj = jsonArr.getJSONObject(0);
        JSONObject geoMetryObject = jsonObj.getJSONObject("geometry");
        JSONObject locationObject = geoMetryObject.getJSONObject("location");
        double lat = locationObject.getDouble("lat");
        double lon = locationObject.getDouble("lng");
		return new Coordinate(lat, lon);
	}
	

}

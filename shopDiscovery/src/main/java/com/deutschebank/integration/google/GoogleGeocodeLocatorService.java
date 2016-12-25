package com.deutschebank.integration.google;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

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
	public JSONObject getResponseForAddress(String encodedAddr) {

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

		System.out.println(stringBuilder.toString());
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(stringBuilder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;

	}
	
	
	

}

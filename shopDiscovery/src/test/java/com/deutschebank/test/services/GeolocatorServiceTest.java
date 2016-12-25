package com.deutschebank.test.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deutschebank.integration.google.GoogleGeocodeLocatorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GeolocatorServiceTest {

	@Autowired
	private GoogleGeocodeLocatorService geoCodeLocator;
	
	@Test
	public void getResponseFromGoogleGeocodeAPITest() {
       assertNotNull(geoCodeLocator.getResponseForAddress("411028+hadapsar+pune"));
	}

}

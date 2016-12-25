package com.deutschebank.test.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deutschebank.integration.google.GeocodeLocatorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GeolocatorServiceTest {

	@Autowired
	private GeocodeLocatorService geoCodeLocator;
	
	@Test
	public void test() {
       assertNotNull(geoCodeLocator.getResponseFromGoogleGeocodeAPI("411028+hadapsar+pune"));
	}

}

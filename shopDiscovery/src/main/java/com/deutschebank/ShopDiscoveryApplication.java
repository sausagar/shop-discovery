package com.deutschebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Saurabh.Sagar
 *
 *  Starting point of application
 *  Running this will start the embedded Tomcat Server on 8080 (default)
 *  In case 8080 is unavailable, it can be chnaged in application.properties file
 *
 */
@SpringBootApplication
public class ShopDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopDiscoveryApplication.class, args);
	}
}

package com.deutschebank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deutschebank.dao.InMemoryDataStore;

@Configuration
public class AppConfiguration {

	/**
	 * @return
	 * InMemoryDataStore as the name suggest is the temporary in memory data model.
	 * Used by the application in order to store shops
	 */
	@Bean
	public InMemoryDataStore getInMemoryDataStore() {
		return new InMemoryDataStore();
	}
	
}

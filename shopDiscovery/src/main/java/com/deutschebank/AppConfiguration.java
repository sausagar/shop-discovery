package com.deutschebank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deutschebank.dao.InMemoryDataStore;

@Configuration
public class AppConfiguration {

	@Bean
	public InMemoryDataStore getInMemoryDataStore() {
		return new InMemoryDataStore();
	}
	
}

package com.sumanway2learn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sumanway2learn.service.PersonService;

@Configuration
public class MyCustomeConfiguration {

	@Bean
	public PersonService personService() {
		return new PersonService();
	}

}

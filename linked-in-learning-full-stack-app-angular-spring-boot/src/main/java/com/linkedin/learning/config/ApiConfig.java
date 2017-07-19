package com.linkedin.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;

/*First, let's add a configuration annotation so that Spring knows to use this class for configuration. Let's left click on the error and import the Spring framework configuration annotation. Next, we will add two beans to this class, an ObjectMapper and an ObjectWriter. The ObjectMapper will define how JSON strings in the request body are deserialized from requests in POJOs or Plain Old Java Objects, which we use to model our data.

The ObjectWriter will define how we serialize our Java objects into a JSON string in the response body. Let's create a new public method, ObjectMapper, that returns a ObjectMapper object. Next, left click on the error and import the Jackson ObjectMapper. Then let's add a bean annotation to that method*/

@Configuration
public class ApiConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
	@Bean
	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return (ObjectWriter) objectMapper.writerWithDefaultPrettyPrinter();
	}
	
}

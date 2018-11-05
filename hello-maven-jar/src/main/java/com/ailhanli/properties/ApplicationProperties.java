package com.ailhanli.properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

	private final Environment env;

	public ApplicationProperties(Environment env) {
		super();
		this.env = env;
	}
	
	public String getMessage() {
		return env.getProperty("message");
	}
}
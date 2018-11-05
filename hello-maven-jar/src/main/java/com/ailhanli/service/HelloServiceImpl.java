package com.ailhanli.service;

import org.springframework.stereotype.Service;

import com.ailhanli.properties.ApplicationProperties;

@Service
public class HelloServiceImpl implements HelloService {

	private final ApplicationProperties properties;

	public HelloServiceImpl(ApplicationProperties properties) {
		super();
		this.properties = properties;
	}

	public String getMessage() {
		return properties.getMessage();
	}
}
package com.ailhanli.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ailhanli.AppConfig;
import com.ailhanli.properties.ApplicationProperties;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class TestHelloWorldService {

	private HelloService hs;
	
	@Before
	public void setup() {
		ApplicationProperties properties = Mockito.mock(ApplicationProperties.class);
		
		when(properties.getMessage()).thenReturn("hello world!");
		
		hs = new HelloServiceImpl(properties);
	}
	
	
	@Test
	public void test_GetCorrectMessage() {
		String expected= "hello world!";
		
		String actual = hs.getMessage();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		fail("not implemented yet!");
	}
	
}
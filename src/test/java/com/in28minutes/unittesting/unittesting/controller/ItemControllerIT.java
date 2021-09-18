package com.in28minutes.unittesting.unittesting.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@ExtendWith(MockitoExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contentLoaads() throws JSONException {
		String response = this.restTemplate.getForObject("/all-items-from-database", String.class);
		JSONAssert.assertEquals("[{id:10001},{id:10002},{id:10003}]", response, false);
	}
}

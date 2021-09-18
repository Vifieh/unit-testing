package com.in28minutes.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actualResponse = "{\"id\":1,\"name\":\"Books\",\"price\":10,\"quantity\":1000}";
	
	@Test
	public void jsonAssert_StrickTrue() throws JSONException {
		String expectResponse = "{\"id\":1,\"name\":\"Books\",\"price\":10,\"quantity\":1000}";
		
		JSONAssert.assertEquals(expectResponse , actualResponse, true);
	}
	
	@Test
	public void jsonAssert_StrickFalse() throws JSONException {
		String expectResponse = "{\"id\":1,\"name\":\"Books\",\"price\":10}";
		
		JSONAssert.assertEquals(expectResponse , actualResponse, false);
	}
	
	@Test
	public void jsonAssert_WithoutEscapeCharacter() throws JSONException {
		String expectResponse = "{id:1, name:Books, price:10, quantity: 1000}";
		
		JSONAssert.assertEquals(expectResponse , actualResponse, true);
	}

}

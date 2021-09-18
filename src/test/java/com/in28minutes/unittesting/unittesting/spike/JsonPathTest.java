package com.in28minutes.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import static org.assertj.core.api.Assertions.assertThat;

public class JsonPathTest {
	
	
	@Test
	public void learning()  {
		String responseFromService = "[{\"id\":1, \"name\":\"Item2\", \"price\":10, \"quantity\": 10}"
				+ "{\"id\":2, \"name\":\"Item2\", \"price\":10, \"quantity\": 10},"
				+ "{\"id\":3, \"name\":\"Item2\", \"price\":10, \"quantity\": 10}"
				+ "]"; 
		
		DocumentContext context = JsonPath.parse(responseFromService);
		int length = context.read("$.length()");
		assertThat(length).isEqualTo(3);
	}

}

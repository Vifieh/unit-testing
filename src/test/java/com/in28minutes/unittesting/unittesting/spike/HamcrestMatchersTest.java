package com.in28minutes.unittesting.unittesting.spike;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;

class HamcrestMatchersTest {

	@Test
	void learning() {
		List<Integer> numbers = Arrays.asList(12,13,23);
		
		assertThat(numbers, hasSize(3));
		assertThat(numbers, hasItems(12,13));
		assertThat(numbers, everyItem(greaterThan(10)));

	}

}

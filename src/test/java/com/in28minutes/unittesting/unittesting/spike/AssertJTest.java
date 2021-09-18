package com.in28minutes.unittesting.unittesting.spike;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AssertJTest {

	@Test
	void learning() {
		List<Integer> numbers = Arrays.asList(12,13,23);
		
//		assertThat(numbers, hasSize(3));
		assertThat(numbers).hasSize(3)
							.contains(12,23)
							.allMatch(x -> x >10);
		
		assertThat("").isEmpty();
//		assertThat(numbers, hasItems(12,13));
//		assertThat(numbers, everyItem(greaterThan(10)));

	}

}

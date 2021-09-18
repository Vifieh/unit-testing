package com.in28minutes.unittesting.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@TestPropertySource(locations = {"classpath: test-configuration.properties"})
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}

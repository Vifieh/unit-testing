package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

	@InjectMocks
	SomeBusinessImpl business;
	
	@Mock
	SomeDataService dataServiceMock;
	
	@Test
	void calculateSumUsingSomeDataService_basic() {
		
		when(dataServiceMock.retrievAllData()).thenReturn(new int[] {1,2,3});
		
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void calculateSumUsingSomeDataService_empty() {

		when(dataServiceMock.retrievAllData()).thenReturn(new int[] {});
		
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
}

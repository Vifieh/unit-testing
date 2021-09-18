package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retrievAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
}

class SomeBusinessStubTest {

	@Test
	void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumUsingSomeDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
}

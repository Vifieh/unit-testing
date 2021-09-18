package com.in28minutes.unittesting.unittesting.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
	
	SomeDataService someDataService; 
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
		
	}
	
	public int calculateSumUsingDataService() {
		int[] data = someDataService.retrievAllData();
		
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
		
	}
}

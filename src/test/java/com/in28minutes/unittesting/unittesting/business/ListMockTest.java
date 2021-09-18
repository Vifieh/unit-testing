package com.in28minutes.unittesting.unittesting.business;



import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.times;


class ListMockTest {

	List<String> mock = mock(List.class);

	@Test
	void size_basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
	}
	
	@Test
	void returnWithDifferentValues() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
	
	@Test
	void returnWithParameters() {
		when(mock.get(0)).thenReturn("in28minutes");
		assertEquals("in28minutes", mock.get(0));
	}
	
	@Test
	void returnWithGenericParameters() {
		when(mock.get(anyInt())).thenReturn("in28minutes");
		assertEquals("in28minutes", mock.get(0));
	}
	
	@Test
	void verificationBasics() {
		String value = mock.get(0);
		
		//verification
		verify(mock).get(0);
	}
	
	@Test
	void argumentCapture() {
	mock.add("SOmeString");
	
	//verificatrion
	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		
		assertEquals("SOmeString", captor.getValue());
	}
	
	@Test
	void multipleArgumentCapture() {
	mock.add("SOmeString");
	mock.add("SOmeString2");
	
	
	//verificatrion
	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		
		List<String> allValue = captor.getAllValues();
		assertEquals("SOmeString", allValue.get(0));
	}
	
	@Test
	void spying() {
		ArrayList arrayListSpy = spy(ArrayList.class);
		arrayListSpy.add("Test0");

		System.out.println(arrayListSpy.get(0));
		System.out.println(arrayListSpy.size());
		arrayListSpy.add("Test");
		System.out.println(arrayListSpy.size());

	}
}

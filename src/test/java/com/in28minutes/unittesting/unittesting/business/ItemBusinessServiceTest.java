package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {

	@InjectMocks
	private ItemBusinessService business;
	
	@Mock
	private ItemRepository repository;
	
	@Test
	public void retrieveAllItems() {
		when(repository.findAll()).thenReturn( 
				Arrays.asList(new Item(2,"item", 10, 10), new Item(3,"item2", 20, 20)));
		
		List<Item> items = business.retrieveAllItems();
		
		assertEquals(100, items.get(0).getValue());
		assertEquals(400, items.get(1).getValue());
	}
}

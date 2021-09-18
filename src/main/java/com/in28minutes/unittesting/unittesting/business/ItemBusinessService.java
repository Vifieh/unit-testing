package com.in28minutes.unittesting.unittesting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@Component
public class ItemBusinessService {

	@Autowired
	private ItemRepository repository;
	
	public Item retrieveHardCodedItem() {
		// TODO Auto-generated method stub
		return new Item(1, "Books", 10, 1000);
	}
	
	public List<Item> retrieveAllItems() {
		
		List<Item> items = repository.findAll();
		for(Item item: items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}

}

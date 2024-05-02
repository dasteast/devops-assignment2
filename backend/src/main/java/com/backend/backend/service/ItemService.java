package com.backend.backend.service;

import com.backend.backend.dto.Item;

import java.util.List;

public interface ItemService {
	
	public Item addItem(Item item);
	
	List<Item> getAllItems();
	
	public List<Item> getItemByName(String name);
	
//	update item
	public Item updateItem (Item item, int id);
}
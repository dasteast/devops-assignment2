package com.backend.backend.service;

import com.backend.backend.dto.Item;
import com.backend.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImp implements ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	@Override
	public Item addItem(Item item) {
		return repository.save(item);
	}

	@Override
	public List<Item> getAllItems() {
		return repository.findAll();
	}
	
	@Override
	public List<Item> getItemByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Item updateItem(Item item, int id) {
		/*Item item1 = repository.findById(id).get();
		if(item.getName() != null) {
			item1.setName(item.getName());
		}
		if(item.getDescription() != null) {
			item1.setDescription(item.getDescription());
		}
		return repository.save(item1);*/
		return null;
	}
}
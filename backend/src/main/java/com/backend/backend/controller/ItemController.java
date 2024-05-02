package com.backend.backend.controller;
import com.backend.backend.dto.Item;
import com.backend.backend.service.ItemServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ItemController {
	
	@Autowired
	private ItemServiceImp service;
	
	@PostMapping("/items")
	public Item addItem(@RequestBody Item item){
		return service.addItem(item);
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/items/{name}")
	public List<Item> getItemByName(@PathVariable("name") String name){
		return service.getItemByName(name);
	}
	
	@PutMapping("/items/{id}")
	public Item updateItem (@RequestBody Item item, @PathVariable int id) {
		return service.updateItem(item, id);
	}
}
package com.backend.backend.repository;

import com.backend.backend.dto.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	

	public List<Item> findByName (String name);
}
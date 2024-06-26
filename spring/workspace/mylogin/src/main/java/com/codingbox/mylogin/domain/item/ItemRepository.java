package com.codingbox.mylogin.domain.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ItemRepository {
	private static final Map<Long, Item> store = new HashMap<>();
	private static long sequence = 0L;
	
	public Item save(Item item) {
		item.setId(++sequence);
		store.put(item.getId(), item);
		return item;
	}
	
	public Item findById(Long id) {
		return store.get(id);
	}
	
	public List<Item> findAll(){
		return new ArrayList<Item>(store.values());
	}
	
	public void update(Long itemId, Item upateParam) {
		// item을 먼저 찾는다
		Item findItem = findById(itemId);
		findItem.setItemName(upateParam.getItemName());
		findItem.setPrice(upateParam.getPrice());
		findItem.setQuantity(upateParam.getQuantity());
	}
}











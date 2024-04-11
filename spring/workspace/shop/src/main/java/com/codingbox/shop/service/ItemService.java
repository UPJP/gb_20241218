package com.codingbox.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingbox.shop.domain.Item;
import com.codingbox.shop.dto.ItemForm;
import com.codingbox.shop.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {
	
	public final ItemRepository itemRepository;
	
	@Transactional
	public Long join(Item item) {
		itemRepository.save(item);
		return item.getId();
	}
	
	public List<Item> findItems(){
		return itemRepository.faindAll();
	}
	
	public Item findOne(Long itemId){
		return itemRepository.findOne(itemId);
	}

	@Transactional
	public Item updateItem(Long itemId, Item item) {
		// itemId값을 기준으로 영속성 컨텍스트 영역으로 들어간다
		Item findItem = itemRepository.findOne(itemId);
		findItem.setPrice(item.getPrice());
		findItem.setName(item.getName());
		findItem.setStockQuantity(item.getStockQuantity());
		
		/*
		 * 영속성 컨텍스트 영역에서는 save or merge를 호출할 필요가 없다
		 * 영속성 컨텍스트에 변화가 일어나게 되고,
		 * 변화가 일어나는 것을 jpa가 감지하게 된다.
		 * => 이게 변경감지에 의해서 데이터를 update 하는 방법이다.
		 */
		
		return findItem;
	}

	@Transactional
	public void updateItem(Long itemId, String name, int price, int stockQuantity) {
		Item findItem = itemRepository.findOne(itemId);
		findItem.setName(name);
		findItem.setPrice(price);
		findItem.setStockQuantity(stockQuantity);		
	}
	
}

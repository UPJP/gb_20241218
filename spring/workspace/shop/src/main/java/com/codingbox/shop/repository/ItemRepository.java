package com.codingbox.shop.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.codingbox.shop.domain.Item;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

	private final EntityManager em;
	
	//저장
	public void save(Item item) {
//		if(item.getId()==null) {  // 신규건
			em.persist(item);
//		}else {
			//update
//			em.merge(item);
//		}
	}
	//조회
	public List<Item> faindAll(){
		return em.createQuery("select i from Item i",Item.class).getResultList();
	}
	//한명만 검색
	public Item findOne(Long itemid) {
		return em.find(Item.class, itemid);
	}
}

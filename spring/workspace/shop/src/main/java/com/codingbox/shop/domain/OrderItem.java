package com.codingbox.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {

	@Id @GeneratedValue
	@Column(name = "order_item_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	private int orderPrice;
	private int count;
	
	//============= 비즈니스 로직 ===================
	public static OrderItem createOrderItem(Item item, int price, int count) {
		OrderItem orderItem = new OrderItem();
		orderItem.setItem(item);
		orderItem.setOrderPrice(price);
		orderItem.setCount(count);
		
		//주문한 만큼 재고 조정 -> item 
		item.removeStock(count);
		
		
		return orderItem;
	}

	public void cancel() {
		getItem().addStock(count);
	}
	
}

package com.codingbox.jpaitem.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter @Setter
@NoArgsConstructor
public class Item {

	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;
	private String name ; 
	private int price;
	private int stockQuantity;
	
	@OneToMany(mappedBy = "item")
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public void addOrderItems(OrderItem orderItem) {
		orderItem.setItem(this);
		this.orderItems.add(orderItem);
	}
}

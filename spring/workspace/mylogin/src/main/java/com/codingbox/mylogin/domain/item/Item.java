package com.codingbox.mylogin.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
	private Long id;
	private String itemName;   
	private Integer price;   	//가격이 null 일수도 있기 때문에
	private Integer quantity;	//수량이 null 일수도 있기 때문에
	
	public Item(String itemName, Integer price, Integer quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item(){ }
	
}

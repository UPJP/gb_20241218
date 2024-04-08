package com.codingbox.jpaitem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter @Setter
@NoArgsConstructor
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long orderId;
	
	@ManyToOne
	@JoinColumn(name= "ORDER_ID")
	private Order order ;
	
	@ManyToOne
	@JoinColumn(name ="ITEM_ID")
	private Item item;
	
	private int orderPrice;
	private int count;
	
}

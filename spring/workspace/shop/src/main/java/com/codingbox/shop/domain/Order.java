package com.codingbox.shop.domain;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

	@Id @GeneratedValue
	@Column(name = "order_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	//주문 시간
	private LocalDateTime orDateTime;
	
	//주문 상태(ORDER, CANCEL)
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems = new ArrayList<>();
	
	///////////////////////////////////연관관계 메서드 ///////////////////////////
	public void setMember(Member member) {
		this.member = member;
		member.getOrders().add(this);
	}
	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
		orderItem.setOrder(this);
	}

	
}
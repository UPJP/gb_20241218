package com.codingbox.test.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name="ORDERS")
public class Order {

	@Id @GeneratedValue
	@Column(name= "ORDER_ID")
	private Long id;
	
	// 주인
	@ManyToOne
	@JoinColumn(name= "MEMBER_ID")
	private Member member;
	
	private LocalDateTime ordatDateTime;
	private String status;
	
	@Override
	public String toString() {
		return "Order id=" + id +
				", ordatDateTime=" + ordatDateTime +
				", status=" + status
				+ "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void changeMember(Member member) {
		this.member = member;
		member.getOrders().add(this);
	}

	public void setOrdatDateTime(LocalDateTime ordatDateTime) {
		this.ordatDateTime = ordatDateTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}

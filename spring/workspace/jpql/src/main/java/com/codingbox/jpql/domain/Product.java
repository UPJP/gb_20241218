package com.codingbox.jpql.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Product {

	@Id @GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long id; 
	private String name;
	private int price;
	private int stockAmount;
}

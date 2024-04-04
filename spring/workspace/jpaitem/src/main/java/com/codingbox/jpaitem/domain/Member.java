package com.codingbox.jpaitem.domain;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
	
	@Id
	@GeneratedValue					// 선택안하면 AUTO
	@Column(name = "MEMBER_ID")
	private Long id;
	
	private String name;
	private String city; 
	private String street;
	private String zipcode;
}

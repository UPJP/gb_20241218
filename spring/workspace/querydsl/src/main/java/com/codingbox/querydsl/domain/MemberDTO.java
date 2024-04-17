package com.codingbox.querydsl.domain;

import lombok.Data;

@Data
public class MemberDTO {
	private String name;
	private int age;
	
	public MemberDTO() {}
	
	public MemberDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

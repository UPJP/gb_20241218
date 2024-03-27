package com.codingbox.core2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

//db dto 1e1 why?

@Entity
public class Member {

	@Id
	/* @GeneratedValue(strategy =GenerationType.IDENTITY) mysql 밑은 오라클*/
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name="seq",sequenceName = "member_seq")
	private int id;
	private String name;
	
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

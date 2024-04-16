package com.codingbox.test.entity;

import java.util.ArrayList;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

	@Id @GeneratedValue
	@Column(name= "MEMBER_ID")
	private Long id;
	private String name;

	//1-2 출력 필수
//	private String city;
//	private String street;
//	private String zipcode;
	
	// 노예
	@OneToMany(mappedBy = "member")
	private List<Order> orders =new ArrayList<>();
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}


	//1-2 출력 필수 생성자
//	public Member(String city, String street, String zipcode) {
//		super();
//		this.city = city;
//		this.street = street;
//		this.zipcode = zipcode;
//	}
	
	//1-3 출력 필수
	@Embedded
	private Address address;
	
//	public Member() {}


//	@Override
//	public String toString() {
//		return "Member [id=" + id + 
//				", name=" + name + 
//				", city=" + city + 
//				", street=" + street + 
//				", zipcode=" + zipcode
//				+ "]";
//	}


	//1-2출력
	
	

	//1-3출력
	public String toString2() {
		return "Member [id=" + id 
				+ ", name=" + name 
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
}

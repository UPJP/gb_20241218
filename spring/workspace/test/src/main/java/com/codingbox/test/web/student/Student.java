package com.codingbox.test.web.student;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {
	private Long id ;  				//번호
	private String name;			//이름
	private int age ; 				//나이
	private Integer subjectnum;		//과목수 
	private String phone;			//전화번호
	private String address; 		//주소
	
	public Student(String name, int age, Integer subjectnum, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.subjectnum = subjectnum;
		this.phone = phone;
		this.address = address;
	}
	
	public Student() {};
	
}

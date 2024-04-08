package com.codingbox.jpaitem.embedded;

import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Period {
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	
	//테스트를 위해 파라미터가 있는 생성자 만들기 
	public Period(LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	//기본생성자 필수
	public Period() {}
	
}

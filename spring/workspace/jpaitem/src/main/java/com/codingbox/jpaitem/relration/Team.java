package com.codingbox.jpaitem.relration;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Team {
	@Id @GeneratedValue
	@Column(name = "TEAM_ID")
	private Long id;
	private String name;

	/*
	 * team에 의해서 관리가 된다
	 * mappedBy가 적힌 곳은 읽기만 가능하다
	 * 값을 넣어봐야 아무일도 벌어지지 않는다.
	 */
	@OneToMany(mappedBy = "team") //Fk 연관관계의 맴버변수 입력
	private List<Member> member = new ArrayList<>();

	//무한 루프 주의
//	@Override
//	public String toString() {
//		return "Team [id=" + id 
//				+ ", name=" + name 
//				+ ", member=" + member + "]"; //<-- member 둘중 하나 지워야함
//	}
	
	
}

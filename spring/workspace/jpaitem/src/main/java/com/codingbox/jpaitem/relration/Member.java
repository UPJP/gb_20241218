package com.codingbox.jpaitem.relration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@NoArgsConstructor
public class Member {

	@Id @GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;
	@Column(name = "USERNAME")
	private String name;
//	@Column(name = "TEAM_ID")
//	private Long teamId;
	
	// @ManytoOne : 여기서는 Team 하나이다. n:1
	// @JoinColumn(name= "TEAM_ID") : 관계 컬럼을 적어준다. TEAM_ID와 조인해야한다.
	
	// 외래키가 있는 객체가 주인이다.
	@ManyToOne
	@JoinColumn(name= "TEAM_ID")
//	@Setter(value = AccessLevel.NONE)
	private Team team;
	
	public void changeTeam(Team team) {
		this.team = team;
		//this : 나 자신의 인스턴스를 넣어준다.
		team.getMember().add(this);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//무한 루프 주의
//	@Override
//	public String toString() {
//		return "Member [id=" + id 
//				  + ", name=" + name 
//				  + ", team=" + team + "]";  // <- team에서 둘중 지줘야함
//	}

}

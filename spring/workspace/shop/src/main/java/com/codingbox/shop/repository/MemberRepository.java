package com.codingbox.shop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingbox.shop.domain.Member;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class MemberRepository {

	// jpa가 지원해주는 표준
	// spring이 entitymanager를 만들어서 em에다가 주입
	/*
	 * @PersistenceContext가 있어야 표준 EntityManager주입이 가능하다.
	 * 그러나, spring의 @Autowired가 주입이 되도록 이러한 지원을 해준다.
	 * 
	 */
	//@PersistenceContext
	@Autowired
	private final EntityManager em;
	
	//저장
	public void save(Member member) {
		em.persist(member);
	}
	//조회
	public List<Member> findAll(){
		return em.createQuery("select m from Member m",Member.class).getResultList();
	}
	//특정 이름으로 전체 검색
	public List<Member> findByList(String name){
		return em.createQuery("select m from Member m where m.name=:name",Member.class)
				.setParameter("name", name).getResultList();
	}
	
	// 한명만 검색
	public Member findOne(Long MemberId) {
		return em.find(Member.class, MemberId);
	}
	
}

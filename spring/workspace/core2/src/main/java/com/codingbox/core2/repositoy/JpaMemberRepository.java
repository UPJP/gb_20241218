package com.codingbox.core2.repositoy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingbox.core2.dto.Member;

import jakarta.persistence.EntityManager;

@Repository
public class JpaMemberRepository implements MemberRepository{

	private final EntityManager em;
	@Autowired  //<-생성자가 하나일경우 알아서 프레임워크가 넣어줌
	public JpaMemberRepository(EntityManager em) {
		this.em= em;
	}
	@Override
	public Member save(Member member) {
		em.persist(member);
		return member;
	}

	@Override
	public List<Member> findAll() {
		return em.createQuery("select m from Member m",Member.class).getResultList();
	}

}

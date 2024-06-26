package com.codingbox.jpaitem;


import com.codingbox.jpaitem.embedded.Address;
import com.codingbox.jpaitem.embedded.Member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {		
			Address addr = new Address("서울","강남","123");
			
			Member member = new Member();
			member.setUsername("user1");
			member.setAddress(addr);
			
			em.persist(member);
			
			//새로운 객체를 생성한다
			Address copyAddr =new Address(addr.getCity(),addr.getStreet(),addr.getZipcode());
			
			Member member2 = new Member();
			member2.setUsername("user2");
			member2.setAddress(copyAddr);
			
			member.getAddress().setCity("newCity"); // 왜 문제임 ?
			
			em.persist(member2);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}

package com.codingbox.jpql;

import java.util.List;

import com.codingbox.jpql.domain.Address;
import com.codingbox.jpql.domain.Member;
import com.codingbox.jpql.domain.Team;
import com.codingbox.jpql.dto.MemberDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpqlMain5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			for (int i = 0; i < 100; i++) {
				Member member = new Member();
				member.setUsername("member1"+i);
				member.setAge(i);
				em.persist(member);
			}
			
			em.flush();
			em.clear();

			// 페이징 처리
			String jpql = "select m from Member m order by m.username desc";
			List<Member> resultList
				= em.createQuery(jpql, Member.class)
					.setFirstResult(10) //10번째 부터
					.setMaxResults(20)	//20뻔재 가져와라
					.getResultList();
				
			System.out.println("result.size : "+resultList.size());
			
			for(Member member : resultList) {
				System.out.println("member = "+member.toString());
			}
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}

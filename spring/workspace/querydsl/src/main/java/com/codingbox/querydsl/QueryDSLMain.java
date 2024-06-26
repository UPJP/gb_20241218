package com.codingbox.querydsl;

import java.util.List;

import com.codingbox.querydsl.domain.Member;
import com.codingbox.querydsl.domain.QMember;
import com.codingbox.querydsl.domain.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import static com.codingbox.querydsl.domain.QMember.*;

public class QueryDSLMain {

	public static void main(String[] args) {
		EntityManagerFactory emf
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();		
		EntityTransaction tx = em.getTransaction();
		// queryDSL
		JPAQueryFactory queryFactory =new JPAQueryFactory(em); 
		tx.begin();
		
		try {
			Team teamA = new Team("teamA");
			Team teamB = new Team("teamB");
			em.persist(teamA);
			em.persist(teamB);
			
			Member member1 =new Member("member1",10,teamA);
			Member member2 =new Member("member2",20,teamA);
			Member member3 =new Member("member3",30,teamB);
			Member member4 =new Member("member4",40,teamB);
			em.persist(member1);
			em.persist(member2);
			em.persist(member3);
			em.persist(member4);
			
			
			//초기화
			em.flush();
			em.clear();
			
			List<Member> members = em.createQuery("select m from Member m",Member.class)
									 .getResultList();
			
			for(Member member : members) {
				System.out.println("member : "+member);
				System.out.println("-> member.team : "+member.getTeam());
			}
			
			// jpql : member1을 찾기
			String jpqlString = "select m from Member m where m.username = :username";
			
			Member findByJpql = em.createQuery(jpqlString,Member.class)
								  .setParameter("username","member1")
								  .getSingleResult();
			System.out.println("findByJpql : " + findByJpql.getUsername().equals("member1"));
			
			
			// QMember의 이름을 부여한다. 별칭부여. 크게 중요하진 않음
			//QMember m = new QMember("m");
//			QMember m = QMember.member;  
			Member findByQueryDSL = queryFactory.select(member)
												.from(member)
												.where(member.username.eq("member1")
														.and(member.age.eq(10))) // 파라미터 바인딩
												.fetchOne();
			System.out.println("findByQueryDSL : " + findByQueryDSL.getUsername().equals("member1"));
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}


package com.codingbox.querydsl;



import com.codingbox.querydsl.domain.Member;
import com.codingbox.querydsl.domain.QMember;
import com.codingbox.querydsl.domain.Team;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import oracle.net.aso.q;

import static com.codingbox.querydsl.domain.QMember.*;
import static com.codingbox.querydsl.domain.QTeam.*;

import java.util.List;

import org.hibernate.query.criteria.JpaExpression;

public class QueryDSLMain14 {

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
			Member member5 =new Member(null,100,teamB);
			Member member6 =new Member("member6",100,teamB);
			Member member7 =new Member("member7",100,teamB);

			em.persist(member1);
			em.persist(member2);
			em.persist(member3);
			em.persist(member4);
			em.persist(member5);
			em.persist(member6);
			em.persist(member7);
			
			//초기화
			em.flush();
			em.clear();

			// 프로젝션 대상이 하나
			List<String> result = queryFactory.select(member.username)
											  .from(member)
											  .fetch();
			for(String s : result){
				System.out.println("s : " + s);
			}
			
			// 프로젝션 대상이 둘 이상일 때 -> 튜플
			List<Tuple> result2 = queryFactory.select(member.username, member.age)
					  .from(member)
					  .fetch();
			for(Tuple t : result2){
				System.out.println("t : " + t);
				String username = t.get(member.username);
				Integer age =t.get(member.age);
				System.out.println("username: "+username);
				System.out.println("age: "+age);
			}
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}


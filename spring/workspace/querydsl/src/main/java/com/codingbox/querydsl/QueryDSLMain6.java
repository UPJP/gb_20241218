package com.codingbox.querydsl;



import com.codingbox.querydsl.domain.Member;

import com.codingbox.querydsl.domain.Team;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import static com.codingbox.querydsl.domain.QMember.*;
import static com.codingbox.querydsl.domain.QTeam.*;

import java.util.List;

public class QueryDSLMain6 {

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
			
			//팀 이름과 , 각 팀의 평균 연령을 구해라 
			//Group by
			List<Tuple> result = queryFactory.select(team.name, member.age.avg())
											 .from(member)
											 .join(member.team,team)
											 .groupBy(team.name)
											 .having(member.age.avg().gt(10))
											 .fetch();
			
			Tuple resultTeamA = result.get(0);
			Tuple resultTeamB = result.get(1);
			
			System.out.println("resultTeamA : "+resultTeamA);
			System.out.println("resultTeamB : "+resultTeamB);
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}


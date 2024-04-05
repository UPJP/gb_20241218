package com.codingbox.jpaitem;

import java.util.List;

import com.codingbox.jpaitem.relration.Member;
import com.codingbox.jpaitem.relration.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {		
			// 양방향 매핑시 가장 많이 하는 실수
//			Member member = new Member();
//			member.setName("member111111");
//			em.persist(member);
//			
//			Team team = new Team();
//			team.setName("TEAM11111");
//			team.getMember().add(member);
//			em.persist(team);
			
			Team team =new Team();
			team.setName("Team2222222");
			em.persist(team);
			
			Member member =new Member();
			member.setName("member222222");
			member.changeTeam(team);
//			member.setTeam(team);
			em.persist(member);
			
			//양방향 매핑시에는 양쪽에 값을 모두 입력해 주어야 한다
			// DB를 다시 다녀오지 않고, 객체 상태로만 넣어준다.
			// 해당 로직은 setter에서 정의
//			team.getMember().add(member);

//			em.flush();  
//			em.clear();
			
			System.out.println("====================================");
			Team findTeam = em.find(Team.class, team.getId());
			List<Member> members =findTeam.getMember();
			for( Member m: members) {
				System.out.println("m : "+ m.getName());
			}
			System.out.println("====================================");
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}

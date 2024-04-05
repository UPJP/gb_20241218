package com.codingbox.jpaitem;







import java.util.List;

import com.codingbox.jpaitem.relration.Member;
import com.codingbox.jpaitem.relration.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {		
			Team team = null;
			Member member = null;
			//저장
//			for (int i=0; i<10; i++) {
//				team = new Team();
//				team.setName("TeamA" +i);
//				em.persist(team);
//				
//				member = new Member();
//				member.setName("Member1" +i);
//				member.setTeam(team);
//				em.persist(member);
//			}
			
			//강제로 DB쿼리를 보고싶을 때 
			em.flush();
			em.clear();
			
			//조회
			Member findMember = em.find(Member.class, 1L);
			Team findTeam =findMember.getTeam();
			System.out.println("findTeamMember: "+ findTeam.getName());
			
			//수정
			Team newTeam = em.find(Team.class, 5L);
			findMember.setTeam(newTeam);
			System.out.println("updatefindTeamName: " + newTeam.getName());
			System.out.println("updateTeam.getId : "+ newTeam.getId());
			
			//양방향 매핑
			Member findSideMember = em.find(Member.class, 5L);
			List<Member> members =findSideMember.getTeam().getMember();
			for( Member m : members) {
				System.out.println("result = " + m.getName());
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

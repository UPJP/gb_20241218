package com.codingbox.jpql;


import java.util.List;

import com.codingbox.jpql.domain.Address;
import com.codingbox.jpql.domain.Member;
import com.codingbox.jpql.domain.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpqlMain3 {

	public static void main(String[] args) {
		EntityManagerFactory emf
			= Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Member member =new Member();
			member.setUsername("member1");
			member.setAge(10);
			em.persist(member);

			em.flush();
			em.clear();
			
			em.createQuery("select m.username, m.age from Member m")
				.getResultList();
			
			
			//임베디드 타입 프로젝션
			//이렇게 사용
			em.createQuery("select o.address from Order o",Address.class)
				.getResultList();
			
			//from Address로는 가지고 올 수 없다
			//address는 소속되어 있기 때문에 소속을 밝혀야한다.
			//사용하지 말것 
//			em.createQuery("select o.address from Address o",Address.class)
//				.getResultList();
			
			
			//엔티티 프로젝션
			// jpql 입장에서 select문이 나가지만, 실제로는 member와 team을 조인해서 값을 가지고 온다.
			// 명시적으로 보여지지 않아서 권장하지 않음
//			List<Team> result2 = em.createQuery("select m.team from Member m",Team.class)
//								 .getResultList();
			// 이렇게 해줘야 join 문법이 나가는지를 인식 할 수 있다.
			List<Team> result2 = em.createQuery("select t from Member m join m.team t",Team.class)
						.getResultList();
			
			//즉, select의 결과값이 100건 이여도 영속성컨텍스트에서 관리 된다는 뜻
			List<Member> result = em.createQuery("select m from Member m",Member.class )
					.getResultList();
			
			Member findMember = result.get(0);
//			System.out.println("findMember : "+findMember);
			findMember.setAge(20); //update
			
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}










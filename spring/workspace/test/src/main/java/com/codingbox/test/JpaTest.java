package com.codingbox.test;

import java.time.LocalDateTime;
import java.util.List;

import com.codingbox.test.entity.Address;
import com.codingbox.test.entity.Member;
import com.codingbox.test.entity.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {		
			
			//1-2
//			Member member = new Member("서울","거꾸로 해도 역삼역","123");
//			member.setName("member");
//			em.persist(member);
//			
			///////////////////////////////////////////////////////
			//1-3
			Address addr = new Address("서울","거꾸로 해도 역삼역","123");
			Member member2 = new Member();
			member2.setName("member");
			member2.setAddress(addr);
			em.persist(member2);
	
//			Address copyAddr = new Address(addr.getCity(),addr.getStreet(),addr.getZipcode());
			
			////////////////////////////////////////////////////////
			Order order;
			for (int i=0; i<10; i++) {
				order =new Order(); 
				order.changeMember(member2);
				order.setStatus("접수"+i);
				order.setOrdatDateTime(LocalDateTime.now());
				em.persist(order);
			}
			
			em.flush();
			em.clear();
			
			String jqpl = "select o from Order o";
			List<Order> orders = em.createQuery(jqpl,Order.class)
								   .getResultList();
			//1-2 출력
//			System.out.println("Member = " + member.toString());
			
			//1-3 출력
			System.out.println("Member = " + member2.toString2());
			
			for(Order o : orders) {
				System.out.println("Order = " + o.toString());
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

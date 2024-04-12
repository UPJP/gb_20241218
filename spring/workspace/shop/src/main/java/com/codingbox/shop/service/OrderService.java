package com.codingbox.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingbox.shop.domain.Item;
import com.codingbox.shop.domain.Member;
import com.codingbox.shop.domain.Order;
import com.codingbox.shop.domain.OrderItem;
import com.codingbox.shop.dto.OrderSearch;
import com.codingbox.shop.repository.ItemRepository;
import com.codingbox.shop.repository.MemberRepository;
import com.codingbox.shop.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderService {

	private final OrderRepository orderRepository;
	
	private final MemberRepository memberRepository;
	private final ItemRepository itemRepository;

	@Transactional
	public Long order(Long memberId, Long itemId, int count) {
		//jpa 영속성 컨텍스트 영역에 들어 간다
		Member member = memberRepository.findOne(memberId);
		Item item = itemRepository.findOne(itemId);
		
		//주문 상품                                        //가격 // 쿠폰 가격     /갯수
		OrderItem orderItem = OrderItem.createOrderItem(item,item.getPrice(),count);
		
		//주문 생성
		Order order = Order.createOrder(member,orderItem);
		
		
		//주문저장
		orderRepository.save(order);
		return order.getId();
	}

	public List<Order> findOrders(OrderSearch orderSearch) {
		return orderRepository.findAll(orderSearch);
	}

	public void cancelOrder(Long orderId) {
		// 영속성 컨텍스트  //취소했을대 나타나는 비즈니스 로직
		Order order = orderRepository.findOne(orderId);
		
		order.cancle();
	}
	
}

package com.codingbox.shop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingbox.shop.domain.Item;
import com.codingbox.shop.domain.Member;
import com.codingbox.shop.service.ItemService;
import com.codingbox.shop.service.MemberService;

@Controller
@RequiredArgsConstructor
public class OrderController {
	
	private final MemberService memberService;
	private final ItemService itemService;
	
	@GetMapping("order")
	public String createForm(Model model) {
		List<Member> members =memberService.findMembers();
		List<Item> items =itemService.findItems();
		
		model.addAttribute("members", members);
		model.addAttribute("items", items);
		
		return "/order/orderForm";
	}
	
}

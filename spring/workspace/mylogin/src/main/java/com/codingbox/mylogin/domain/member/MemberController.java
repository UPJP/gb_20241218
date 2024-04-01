package com.codingbox.mylogin.domain.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

	private final MemberRespository memberRespository;
	
	@GetMapping("/add")
	public String addForm(@ModelAttribute("member") Member member) {
//		model.addAttribute("member",new Member()); <- @ModelAttribute가 대신함
		return "members/addMemberForm";
	}
}

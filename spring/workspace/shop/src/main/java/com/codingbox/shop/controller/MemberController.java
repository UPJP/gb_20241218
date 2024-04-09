package com.codingbox.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingbox.shop.dto.MemberForm;

import jakarta.validation.Valid;

@Controller
public class MemberController {
	
	@GetMapping("/members/new")
	public String CreateFrom(Model model) {
		// validation 처리와 같은 내용 때문에 반값이라도 보내준다.
		model.addAttribute("memberForm", new MemberForm());
		return "members/createMemberForm";
	}
	
	//@Valid 다음에 BindingResult 있으면, error가 발생시 Binding에 담아준다.
	@PostMapping("/members/new")
	public String postMethodName(@Valid MemberForm form,
									BindingResult result) {
		if(result.hasErrors()) {
			return "members/createMemberForm";
		}
		return "redirect:/";
	}
	
}

package com.codingbox.core2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingbox.core2.dto.Member;
import com.codingbox.core2.dto.MemberFormDTO;
import com.codingbox.core2.service.MemberService;

@Controller
public class MemberController {
	// Controller가 Service를 의존한다고 표현
	// Service는 여러 Controller에서 가져다 쓸수 있기위해 Spring Container에 등록을 해야한다.
	/* MemberService mService = new MemberService();  <- 스프링 컨테이너에서 알수없음 등록x */
	
	//스프링 스러게 작업하기
	// service는 Spring Container에 하나만 생성 및 등록해서 같이 공유해서 쓸수 있다.
	private final MemberService memberService;
	
	/*
	 * MemberController가 생성될때, 생성자를 호출해준다
	 * 즉 Service까지 생성해서 자동으로 호출해준다.
	 * @Autowired를 선언해주면 MemberController 생성하면서 스프링이 MemberService와 연결해준다.
	 * 서버 기동시 연결(의존성) 실패 에러를 발생시켜준다
	 * -> 기존은 테스트를 통해서만 service가 오류난다는 것을 알 수 있다.
	 */
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/member/new") //<- velue 숨어있음 파라미터가 하나이면 velue 안써도됨
	public String createForm() {
		return "members/createMemberForm";
	}
	@PostMapping(value="/member/new")
	public String create(MemberFormDTO form) {
		Member member = new Member();
		member.setName(form.getName());
		memberService.join(member);
	
		//홈 화면으로 이동
		return "redirect:/";
	}
	
	@GetMapping("/members") 
	public String list(Model model) {
		List<Member> members=memberService.findMembers();
		model.addAttribute("members",members);
		return "members/memberList";
	}
}

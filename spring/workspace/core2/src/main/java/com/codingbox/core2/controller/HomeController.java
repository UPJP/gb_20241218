package com.codingbox.core2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// 기본 home 화면
	// localhost:9090/ -> home.html
	@GetMapping("/")
	public String home() {
		return "home";
		
	}
}
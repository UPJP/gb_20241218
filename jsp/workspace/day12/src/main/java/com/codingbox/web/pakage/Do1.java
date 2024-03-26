package com.codingbox.web.pakage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Do1 {
	public String execute(HttpServletRequest requsest, HttpServletResponse response) 
			throws ServletException, IOException {
		requsest.setAttribute("result", "do1으로 요청보내기");
		return "do1.jsp";
	}
}

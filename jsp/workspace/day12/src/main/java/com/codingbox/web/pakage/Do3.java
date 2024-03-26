package com.codingbox.web.pakage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Do3 {
	public String execute(HttpServletRequest requsest, HttpServletResponse response) 
			throws ServletException, IOException {
		requsest.setAttribute("result", "do3으로 요청보내기");
		return "do3.jsp";
	}
}

package com.comdingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/num")
public class Num  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get 요청 도착");
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post 요청 도착");
		doProcess(req, resp);
	}
	
	// 공통 메소드로 관리
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		PrintWriter out = response.getWriter();
		out.println(num1 + num2);	
	}
	
}











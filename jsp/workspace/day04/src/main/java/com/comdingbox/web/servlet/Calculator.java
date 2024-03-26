package com.comdingbox.web.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		// 대문자로 비교
		if( arg0.getMethod().equals("GET") ) {
			System.out.println("GET 요청입니다.");
		}else if( arg0.getMethod().equals("POST") ) {
			System.out.println("POST 요청입니다.");
		}
		
		// 부모의 service를 호출해 주면 doPost, doGet메서드를 반드시 
		// 재 구현해 주어야 한다. 
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출 됐습니다.");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출 됐습니다.");
	}
	
	
	
}














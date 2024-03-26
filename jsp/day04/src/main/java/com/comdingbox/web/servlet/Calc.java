package com.comdingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/calc")
public class Calc extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		// Cookie 객체
		Cookie[] cookies = arg0.getCookies();
		
		PrintWriter out = arg1.getWriter();
		
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		int value = 0;
		
		if( !value_.equals("") ) {
			value = Integer.parseInt(value_);
		}
		
		if( op.equals("=") ) {
			// cookies 꺼내기
			int x = 0;
			for( Cookie c : cookies ) {
				if( c.getName().equals("value") ) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}
			
			String operator = "";
			for( Cookie c : cookies ) {
				if( c.getName().equals("op") ) {
					operator = c.getValue();
					break;
				}
			}
			
			
			// 이번 요청(request)에서 받아온 값 가져오기(10=) 
			int y = value;
			
			int result = 0;
			
			if( operator.equals("+") ) {
				result = x + y;
			} else {
				result = x - y;
			}			
			
			out.printf("결과 값 : %d\n", result);
			
		} else {	// 값 저장(cookie에 저장)
			// cookie로 사용할때는 문자열 형태만 사용할 수 있다
			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("op", op);
			
			// 사용자에게 cookie가 전달된다
			arg1.addCookie(valueCookie);
			arg1.addCookie(opCookie);
		}
		
		
	}
}












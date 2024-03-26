package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {

		
		ServletContext application = getServletContext();
		
		String value_ = arg0.getParameter("value");
		String op= arg0.getParameter("operator");
		
		PrintWriter out =arg1.getWriter();
		int value = 0;
		int result = 0 ;
		
		if(!value_.equals("")) {
			value = Integer.parseInt(value_);
		}
		
		if( op.equals("=")) {
			//application 영역에 저장된 값 꺼내오기
			// 5 꺼내오기
			int x = (int) application.getAttribute("value");
			//  + 꺼내오기
			String	operator = (String) application.getAttribute("op");
			
			// 어떤 요청 (request)에서 받아온 값 가져오기 (10=)
			int y = value;
			int result1 =0; 
			
			if ( operator.equals("+")) {
				result1 =x+y;
			}	else {
				result1 = x-y;
			}
			out.printf("결과 값 : id\n", result1);
			
		}else { 	// 값 저장 (application)
			application.setAttribute("value", value);
			application.setAttribute("op", op);
		}

	}
}

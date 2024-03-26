package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cnt")
public class MyServlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
			
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8 ");
		
		int cnt =100;
		String paramCnat=arg0.getParameter("cnt");
		if( paramCnat != null && !paramCnat.equals("")) {
			cnt = Integer.parseInt(paramCnat);
		}

		PrintWriter out = arg1.getWriter();
		
		for(int i=0; i<cnt; i++) {
			out.println((i+1)+" : 안녕 serviet<br>");
					
		}
	}
}	

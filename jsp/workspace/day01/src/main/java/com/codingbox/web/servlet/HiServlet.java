package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HiServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8");
		
		int cnt = 100;
		String paramCnt = arg0.getParameter("cnt");
		if( paramCnt != null && !paramCnt.equals("") ) {
			cnt = Integer.parseInt(paramCnt);
		}
		
		PrintWriter out = arg1.getWriter();
		for( int i=0; i<cnt; i++ ) {
			out.println((i+1) + " : 안녕하세요<br>");
		}
		
	}
}













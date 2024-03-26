package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Calc extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		

		String xStr = arg0.getParameter("x");
		String yStr = arg0.getParameter("y");
		String operator = arg0.getParameter("operator");

		int y = 0, x = 0;

		if (xStr != null && !xStr.equals("")) {
			x = Integer.parseInt(xStr);
		}
		if (yStr != null && !yStr.equals("")) {
			y = Integer.parseInt(yStr);
		}

		int result = 0;
		
		if (operator.equals("덧셈")) {
			result = x + y;
		} else if (operator.equals("뺄셈")) {
			result = x - y;
		}
		

		arg1.getWriter().printf("result is %d \n", result);
		
	}

}

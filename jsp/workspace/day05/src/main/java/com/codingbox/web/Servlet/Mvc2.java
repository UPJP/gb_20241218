package com.codingbox.web.Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/caos")
public class Mvc2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		doGet(arg0, arg1);
		
	
		int num =0;
		String num_ =arg0.getParameter("num");
		if(num_!= null && !num_.equals("")){
			num = Integer.parseInt(num_);
		}
		
		String result="";
		if ( num %2 != 0){
			result= "홀수";
		}else{
			result= "짝수";
		}
		
		arg0.setAttribute("result", result);
		
		RequestDispatcher dispatcher
			= arg0.getRequestDispatcher("mvc2.jsp");
		dispatcher.forward(arg0, arg1);

	}
}

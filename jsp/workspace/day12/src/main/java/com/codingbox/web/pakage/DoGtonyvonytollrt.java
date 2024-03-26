package com.codingbox.web.pakage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DoGtonyvonytollrt extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doprocess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doprocess(req, resp);
	}

	protected void doprocess(HttpServletRequest requsest, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("URI : " + requsest.getRequestURI());
		
		String responseURI = null;

		if (requsest.getRequestURI().equals("/do1.do")) {
//			requsest.setAttribute("result", "do1으로 요청보내기");
//			requsest.getRequestDispatcher("do1.jsp").forward(requsest, response);
			responseURI =new Do1().execute(requsest, response);
			
		} else if (requsest.getRequestURI().equals("/do2.do")) {
//			requsest.setAttribute("result", "do2으로 요청보내기");
//			requsest.getRequestDispatcher("do2.jsp").forward(requsest, response);	
			responseURI =new Do2().execute(requsest, response);
			
		} else if (requsest.getRequestURI().equals("/do3.do")) {
//			requsest.setAttribute("result", "do3으로 요청보내기");
//			requsest.getRequestDispatcher("do3.jsp").forward(requsest, response);
			responseURI =new Do3().execute(requsest, response);
		}
		requsest.getRequestDispatcher(responseURI).forward(requsest, response);
	}
}

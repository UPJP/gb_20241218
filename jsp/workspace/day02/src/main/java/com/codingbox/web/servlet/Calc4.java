package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/calc4")
public class Calc4 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // 세션 객체 가져오기
        HttpSession session = request.getSession();
        
        String value1 = request.getParameter("value");
        String op = request.getParameter("operator");
        
        PrintWriter out = response.getWriter();
        int value = 0;
        int result = 0 ;
        
        if (!value1.equals("")) {
            value = Integer.parseInt(value1);
        }
        
        if (op.equals("=")) {
            // session 영역에 저장된 값 가져오기
            int x = (int) session.getAttribute("value");
            String operator = (String) session.getAttribute("op");
            
            // 현재 요청에서 받아온 값 가져오기
            int y = value;
            int result1 = 0; 
            
            if (operator.equals("+")) {
                result1 = x + y;
            } else {
                result1 = x - y;
            }
            out.printf("결과 값 : %d\n", result1);
            
        } else {    // 값 저장 (session)
            session.setAttribute("value", value);
            session.setAttribute("op", op);
        }

    }
}
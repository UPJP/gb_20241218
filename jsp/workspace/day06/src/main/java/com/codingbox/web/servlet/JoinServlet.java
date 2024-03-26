package com.codingbox.web.servlet;

import java.io.IOException;

import com.codingbox.web.dao.UserDAO;
import com.codingbox.web.dto.UserDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// joinview에서 넘어온 값을 받아옴
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		String username = req.getParameter("username");
		String userphone = req.getParameter("userphone"); 
		// dto 객체 생성
		UserDTO udto = new UserDTO();
		// 객체에 각각 저장
		udto.setUserid(userid);
		udto.setUsername(username);
		udto.setUserphone(userphone);
		udto.setUserpw(userpw);
		// dao 객체 생성 dao에서 DB 커넥션에대헤 정의되어 있음
		UserDAO udao = new UserDAO();
		// 불리언 타입으로 udao.join()이 실행이 됬는지 안됬는지 확인
		boolean check = udao.join(udto);
		if (check) {//회원가입
			
		} else { //가입실패
			
		}
	}
}

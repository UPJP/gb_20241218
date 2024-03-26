package com.codingbox.web.servlet;

import java.io.IOException;

import org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport;

import com.codingbox.web.action.ActionFroward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.us")
public class UserFrontcontroller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doprocese(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doprocese(req,resp);
	
	}
	protected void doprocese (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestRUI =req. getRequestURI();
		ActionFroward forward = null;
		if(requestRUI.equals("/user/userJoin.us")){
			forward =new UserJoinAction().execute(req, resp);
		}else if(requestRUI.equals("/user/UserLogin.us") ){
			forward =new ActionFroward(false, "/app/user/loginview.jsp");
		}else if(requestRUI.equals("/user/UserLoginOK.us")){
			forward =new UserloginOKAction().execute(req, resp);			
		}
		
		//페이지 이동에 대한 일괄처리
		if(forward != null) {
			if(forward.isRedirect()) {						//redirect 방식
				resp.sendRedirect(forward.getPath());
			}else {											//forward 방식
				req.getRequestDispatcher(forward.getPath()).forward(req, resp);	
			}
		}
		
	}
}

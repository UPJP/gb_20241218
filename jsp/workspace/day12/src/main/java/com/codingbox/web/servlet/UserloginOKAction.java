package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionFroward;
import com.codingbox.web.dao.UserDAO;
import com.codingbox.web.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserloginOKAction implements Action {

	@Override
	public ActionFroward execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO();
		ActionFroward forward = new ActionFroward();
		
		String userid =request.getParameter("userid");
		String userpw =request.getParameter("userpw");
		
		forward.setRedirect(true);// redirect
		if(udao.login(userid, userpw)) {
			forward.setPath("/app/main/mainview.jsp");
		}else {
			forward.setPath("/app/user/loginview.jsp");
		}
		return forward;
	}
}

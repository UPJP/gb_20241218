package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionFroward;
import com.codingbox.web.dao.UserDAO;
import com.codingbox.web.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserJoinAction implements Action{

	@Override
	public ActionFroward execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO();
		ActionFroward forward = new ActionFroward();
		
		udto.setUserid(request.getParameter("userid"));
		udto.setUserpw(request.getParameter("userpw"));
		udto.setUsername(request.getParameter("username"));
		udto.setUserphone(request.getParameter("userphone"));
		udto.setUseraddr(request.getParameter("useraddr"));
		
		if(udao.join(udto)) {	//회원가입
			forward.setPath("/app/user/loginview.jsp");
			forward.setRedirect(true);
		}
	
		return forward;
	}

}

package com.codingbox.mylogin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.codingbox.mylogin.session.SessionConst;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginCheckInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestURL = request.getRequestURI();
		System.out.println("[인증 체크 인터셉터실행] : " + requestURL);
		
		HttpSession session = request.getSession(false);
		
		if(session == null || session.getAttribute(SessionConst.LOGIN_MEMEB)==null) {
			System.out.println("[미인증 사용자 요청]");
			//로그인 redirect
			response.sendRedirect("/login?redirectURL" + requestURL);
			return false;
		}
		return true;
	}

}

package com.codingbox.mylogin.filter;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class LogFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String requesURI = httpRequest.getRequestURI();
		String uuid = UUID.randomUUID().toString();
		
		System.out.println("uuid: " + uuid);
		System.out.println("requesURI: " + requesURI);
		chain.doFilter(request, response);
		
		
	}

}

package com.codingbox.web.action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {
	public ActionFroward execute(HttpServletRequest request ,HttpServletResponse response);
}

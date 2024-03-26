package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO dbao = new BoardDAO();
		
		int boardnum = 
			Integer.parseInt(request.getParameter("boardnum"));
		
		// 게시글 조회 update
		dbao.updateReadCount(boardnum);
		
		request.setAttribute("board", dbao.getDetail(boardnum));
		
		forward.setRedirect(false);
		forward.setPath("/board/boardview.jsp");
		
		return forward;
	}

}










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
		
		// 게시글 조회 update/ 비즈니스 로직을 아는것이 중요 함 
		dbao.updateReadCount(boardnum);
		request.setAttribute("board", dbao.getDetail(boardnum));
		request.setAttribute("replylist", dbao.getReplys(boardnum));
		
		forward.setRedirect(false);
		forward.setPath("/board/boardview.jsp");
		
		return forward;
	}

}










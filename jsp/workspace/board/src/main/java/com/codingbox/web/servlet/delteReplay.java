package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class delteReplay implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO dbao = new BoardDAO();
		
		int replynum = Integer.parseInt(request.getParameter("replynum"));
		String boardnum = request.getParameter("boardnum");
		 
		if(dbao.delteReplay(replynum))
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum=" + boardnum);
		
		return forward;
	}

}

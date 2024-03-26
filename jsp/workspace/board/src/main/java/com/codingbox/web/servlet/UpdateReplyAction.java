package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO dbao = new BoardDAO();
		
		int replynum 
		= Integer.parseInt(request.getParameter("replynum"));
		String replycontents 
		= request.getParameter( "reply" + replynum ); 
		int boardnum 
		= Integer.parseInt(request.getParameter("boardnum"));
		
		if( dbao.updateReply(replynum, replycontents) ) {
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum=" + boardnum);
		}
		
		return forward;
	}
	
	
}

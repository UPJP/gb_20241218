package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.ReplyDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		ReplyDTO reply = new ReplyDTO();
		
		int boardnum 
			= Integer.parseInt(request.getParameter("boardnum")); 
		
		reply.setBoardnum(boardnum);
		reply.setUsername( request.getParameter("username") );
		reply.setReplycontents( request.getParameter("replycontents") );
		reply.setPassword( request.getParameter("password") );
		
		if(bdao.addReply(reply)) {
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum=" + boardnum);
		}
		
		return forward;
	}

}









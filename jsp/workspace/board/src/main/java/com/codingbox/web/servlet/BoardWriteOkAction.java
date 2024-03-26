package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.BoardDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardWriteOkAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		BoardDTO bdto = new BoardDTO();
		
		// request 파라미터값 get DTO 담기
		bdto.setBoardtitle( request.getParameter("boardtitle") );
		bdto.setBoardcontents( request.getParameter("boardcontents") );
		bdto.setUsername( request.getParameter("username") );
		
		// dao : insertBoard(dto) return boolean
		if(bdao.insertBoard(bdto)) {
			forward.setPath("/board/BoardWrite.bo");
		}
		forward.setRedirect(true);
		return forward;
	}
	
}







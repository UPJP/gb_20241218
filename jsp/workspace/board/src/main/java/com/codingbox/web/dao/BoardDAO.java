package com.codingbox.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.web.dto.BoardDTO;
import com.codingbox.web.dto.ReplyDTO;
import com.codingbox.web.mybatis.SqlMapConfig;

public class BoardDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;
	
	public BoardDAO() {
		sqlSession = factory.openSession(true);
	}

	public List<BoardDTO> getBoardList(int startRow, int endRow) {
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		
		List<BoardDTO> boardList 
			= sqlSession.selectList("Board.getBoardList", datas);
		return boardList;
	}

	public int getBoardCnt() {
		return sqlSession.selectOne("Board.getBoardCnt");
	}

	public boolean insertBoard(BoardDTO bdto) {
		boolean result = false;
		if( sqlSession.insert("Board.insertBoard", bdto) == 1 ) {
			result = true;
		}
		return result;
	}

	public BoardDTO getDetail(int boardnum) {
		return sqlSession.selectOne("Board.getDetail", boardnum);
	}

	public void updateReadCount(int boardnum) {
		sqlSession.update("Board.updateReadCount", boardnum);
	}

	public boolean addReply(ReplyDTO reply) {
		boolean result = false;
		
		if( sqlSession.insert("Board.addReply", reply) == 1 ) {
			result = true;
		}
		
		return result;
	}

	public List<ReplyDTO> getReplys(int boardnum) {
		List<ReplyDTO> list = new ArrayList<ReplyDTO>();
		
		list= sqlSession.selectList("Board.getReplys", boardnum);
		
		return list;
	}

	public boolean updateReply(int replynum, String replycontents) {
		boolean result =false;
		
		HashMap<String, Object> datas =new HashMap<String, Object>();
		datas.put("replynum", replynum);
		datas.put("replycontents", replycontents);
		System.out.println("replynum : " + replynum);
		System.out.println("replycontents : " + replycontents);
		if(sqlSession.update("Board.updateReply", datas)==1) {
			result = true;
		}
		
		return result;
	}


		public boolean delteReplay(int replynum) {
			boolean result =false;
			
			if(sqlSession.delete("Board.delteReplay",replynum)==1) {
				result = true;
			}
			
			return result;
		}
	

}











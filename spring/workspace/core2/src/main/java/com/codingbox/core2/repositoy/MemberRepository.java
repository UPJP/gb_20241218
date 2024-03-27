package com.codingbox.core2.repositoy;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingbox.core2.dto.Member;

public interface MemberRepository {

	//회원저장
	Member save(Member member);
	
	//전체 찾기
	List<Member> findAll();
	

}

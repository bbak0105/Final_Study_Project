package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Member;

public interface MemberDAO {
	List<Member> selectMemberList();
	
	//µ¿ÀûÄõ¸®
	List<Member> selectDynamicMemberList(Member member);
	}


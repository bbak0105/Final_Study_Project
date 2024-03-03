package com.itwill.service;

import java.util.List;

import com.itwill.dto.Member;


public interface MemberService {
	List<Member> getMemberList();
	
	List<Member> getDynamicMemberList(Member member);
	
}

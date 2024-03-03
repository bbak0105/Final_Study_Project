package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.MemberDAO;
import com.itwill.dto.Member;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberList();
	}

	@Override
	public List<Member> getDynamicMemberList(Member member) {
		// TODO Auto-generated method stub
		return memberDAO.selectDynamicMemberList(member);
	}

}

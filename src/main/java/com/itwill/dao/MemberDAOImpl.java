package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Member;
import com.itwill.mapper.MemberMapper;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Member> selectMemberList() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MemberMapper.class).selectMemberList();
	}

	@Override
	public List<Member> selectDynamicMemberList(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MemberMapper.class).selectDynamicMemberList(member);
	}
	
	
}

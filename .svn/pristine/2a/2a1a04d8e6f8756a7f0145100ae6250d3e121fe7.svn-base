package com.itwill.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Approval;

@Repository
public class ApprovalDAOImpl implements ApprovalDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertApproval(Approval approval) {
		return sqlSession.getMapper(ApprovalDAO.class).insertApproval(approval);
	}
	
	
}

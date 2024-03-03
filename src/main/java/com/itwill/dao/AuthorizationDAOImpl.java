package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Authorization;
import com.itwill.mapper.AuthorizationMapper;

@Repository
public class AuthorizationDAOImpl implements AuthorizationDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertAuthorization(Authorization authorization) {
		return sqlSession.getMapper(AuthorizationMapper.class).insertAuthorization(authorization);
	}
	
	@Override
	public int approvalAuthorization(Authorization authorization) {
		return sqlSession.getMapper(AuthorizationMapper.class).approvalAuthorization(authorization);
	}
	
	@Override
	public int deleteAuthorization(Authorization authorization) {
		return sqlSession.getMapper(AuthorizationMapper.class).deleteAuthorization(authorization);
	}
	
	@Override
	public List<Authorization> selectAthorList() {
		return sqlSession.getMapper(AuthorizationMapper.class).selectAthorList();
	}
	
	@Override
	public Authorization selectAthorNo(String authNo) {
		return sqlSession.getMapper(AuthorizationMapper.class).selectAthorNo(authNo);
	}
	
	@Override
	public List<Authorization> selectApprList() {
		return sqlSession.getMapper(AuthorizationMapper.class).selectApprList();
	}

	@Override
	public List<Authorization> selectDynamicAthorList(Authorization authorization) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AuthorizationMapper.class).selectDynamicAthorList(authorization);
	}

	@Override
	public List<Authorization> selectDynamicApprList(Authorization authorization) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AuthorizationMapper.class).selectDynamicApprList(authorization);
	}
	
	@Override
	public Authorization selectAuthWhile(String empNo) {
		return sqlSession.getMapper(AuthorizationMapper.class).selectAuthWhile(empNo);
	}
	
	
}

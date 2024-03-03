package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Attitude;
import com.itwill.mapper.AttitudeMapper;

@Repository
public class AttitudeDAOImpl implements AttitudeDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertAttitude(Attitude attitude) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AttitudeMapper.class).insertAttitude(attitude);
	}
	
	@Override
	public int insetVacation(Attitude attitude) {
		return sqlSession.getMapper(AttitudeMapper.class).insertVacation(attitude);
	}
	
	@Override
	public int updateAttitude(Attitude attitude) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AttitudeMapper.class).updateAttitude(attitude);
	}
	
	@Override
	public Attitude selectAttdNo(String empNo) {
		return sqlSession.getMapper(AttitudeMapper.class).selectAttdNo(empNo);
	}
	
	@Override
	public List<Attitude> selectAttdList() {
		return sqlSession.getMapper(AttitudeMapper.class).selectAttdList();
	}

	@Override
	public List<Attitude> selectDynamicAttdList(Attitude attitude) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AttitudeMapper.class).selectDynamicAttdList(attitude);
	}
}

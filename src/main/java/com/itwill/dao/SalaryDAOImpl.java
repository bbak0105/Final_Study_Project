package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Salary;
import com.itwill.mapper.SalaryMapper;

@Repository
public class SalaryDAOImpl implements SalaryDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertSalary(Salary salary) {
		return sqlSession.getMapper(SalaryMapper.class).insertSalary(salary);
	}
	
	@Override
	public Salary selectSalaryNo(String salNo) {
		return sqlSession.getMapper(SalaryMapper.class).selectSalaryNo(salNo);
	}
	
	@Override
	public List<Salary> selectSalList() {
		return sqlSession.getMapper(SalaryMapper.class).selectSalList();
	}

	@Override
	public List<Salary> selectDynamicSalList(Salary salary) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SalaryMapper.class).selectDynamicSalList(salary);
	}
}

package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Employee;
import com.itwill.mapper.EmployeeMapper;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertEmployee(Employee employee) {
		return sqlSession.getMapper(EmployeeMapper.class).insertEmployee(employee);
	}
	
	@Override
	public List<Employee> selectEmployeeList() {
		return sqlSession.getMapper(EmployeeMapper.class).selectEmployeeList();
	}
	
	@Override
	public List<Employee> selectDynamicEmpList(Employee employee) {
		return sqlSession.getMapper(EmployeeMapper.class).selectDynamicEmpList(employee);
	}
	
	@Override
	public List<Employee> selectDynamicSalEmpList(Employee employee) {
		return sqlSession.getMapper(EmployeeMapper.class).selectDynamicSalEmpList(employee);
	}
	
	@Override
	public List<Employee> insertSalaryList() {
		return sqlSession.getMapper(EmployeeMapper.class).insertSalaryList();
	}
	
	@Override
	public Employee selectEmployeeNo(String empNo) {
		return sqlSession.getMapper(EmployeeMapper.class).selectEmployeeNo(empNo);
	}
	
	@Override
	public int updateEmployee(Employee employee) {
		return sqlSession.getMapper(EmployeeMapper.class).updateEmployee(employee);
	}
	
	@Override
	public int deleteEmployee(Employee employee) {
		return sqlSession.getMapper(EmployeeMapper.class).deleteEmployee(employee);
	}
	
	@Override
	public Employee selectEmployeeInfo(String empNo) {
		return sqlSession.getMapper(EmployeeMapper.class).selectEmployeeInfo(empNo);
	}
}

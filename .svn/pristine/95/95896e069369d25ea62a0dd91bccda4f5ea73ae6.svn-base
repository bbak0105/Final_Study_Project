package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.SalaryDAO;
import com.itwill.dto.Salary;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	private SalaryDAO salaryDAO;
	
	@Override
	public void insertSalary(Salary salary) {
		salaryDAO.insertSalary(salary);
	}
	
	@Override
	public Salary selectSalaryNo(String salNo) {
		return salaryDAO.selectSalaryNo(salNo);
	}
	
	@Override
	public List<Salary> getSalaryList() {
		return salaryDAO.selectSalList();
	}

	@Override
	public List<Salary> getDynamicSalaryList(Salary salary) {
		// TODO Auto-generated method stub
		return salaryDAO.selectDynamicSalList(salary);
	}
}

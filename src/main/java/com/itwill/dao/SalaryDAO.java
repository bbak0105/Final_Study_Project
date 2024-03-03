package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Salary;

public interface SalaryDAO {
	int insertSalary(Salary salary);
	Salary selectSalaryNo(String salNo);
	List<Salary> selectSalList();
		
	//µ¿Àû sql
	List<Salary> selectDynamicSalList(Salary salary);
}

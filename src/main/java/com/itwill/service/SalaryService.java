package com.itwill.service;

import java.util.List;

import com.itwill.dto.Salary;

public interface SalaryService {
	void insertSalary(Salary salary);
	Salary selectSalaryNo(String salNo);
	List<Salary> getSalaryList();
	
	List<Salary> getDynamicSalaryList(Salary salary);
}

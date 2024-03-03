package com.itwill.mapper;



import java.util.List;

import com.itwill.dto.Salary;

public interface SalaryMapper {
	int insertSalary(Salary salary);
	Salary selectSalaryNo(String salNo);
	List<Salary> selectSalList();	
	
	//µ¿ÀûÄõ¸®
	List<Salary> selectDynamicSalList(Salary salary);
}

package com.itwill.service;

import java.util.List;

import com.itwill.dto.Employee;
import com.itwill.exception.EmpExistsException;
import com.itwill.exception.EmployeeNotFoundException;
import com.itwill.exception.LoginAuthFailException;



public interface EmployeeService {
	void insertEmployee(Employee employee) throws EmpExistsException;
	void updateEmployee(Employee employee) throws EmployeeNotFoundException;
	void deleteEmployee(Employee employee);
	List<Employee> getEmployeeList();
	List<Employee> getDaynamicEmpList(Employee employee);
	List<Employee> getDaynamicSalEmpList(Employee employee);
	List<Employee> getInsertSalaryList();
	Employee getEmployeeNo(String empNo);
	Employee getEmployeeInfo(String empNo) throws EmployeeNotFoundException;
	void loginAuth(Employee employee) throws LoginAuthFailException;
	
}

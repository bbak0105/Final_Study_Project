package com.itwill.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.itwill.dao.EmployeeDAO;
import com.itwill.dto.Employee;
import com.itwill.exception.EmpExistsException;
import com.itwill.exception.EmployeeNotFoundException;
import com.itwill.exception.LoginAuthFailException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public void insertEmployee(Employee employee) throws EmpExistsException{
		if(employeeDAO.selectEmployeeInfo(employee.getEmpNo())!=null) {
			throw new EmpExistsException(employee, "이미 사용중인 사원번호입니다.");
		}
		employee.setEmpPasswd(BCrypt.hashpw(employee.getEmpPasswd(), BCrypt.gensalt(10)));
		employee.setEmpGrade("0");
		employeeDAO.insertEmployee(employee);		
	}
	
	@Override
	public List<Employee> getEmployeeList() {
		return employeeDAO.selectEmployeeList();
	}
	
	@Override
	public List<Employee> getDaynamicEmpList(Employee employee) {
		return employeeDAO.selectDynamicEmpList(employee);
	}
	
	@Override
	public List<Employee> getDaynamicSalEmpList(Employee employee) {
		return employeeDAO.selectDynamicSalEmpList(employee);
	}
	
	@Override
	public Employee getEmployeeNo(String empNo) {
		return employeeDAO.selectEmployeeNo(empNo);
	}
	
	@Transactional
	@Override
	public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
		if(employeeDAO.selectEmployeeInfo(employee.getEmpNo())==null) {
			throw new EmployeeNotFoundException("사원정보가 존재하지 않습니다.");
		}
		String empPasswd=employee.getEmpPasswd();
		if(empPasswd!=null && !empPasswd.equals("")) {
			employee.setEmpPasswd(BCrypt.hashpw(employee.getEmpPasswd(), BCrypt.gensalt(10)));
		}
		
		employeeDAO.updateEmployee(employee);		
	}
	
	@Transactional
	@Override
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee); 		
	}
	
	@Override
	public List<Employee> getInsertSalaryList() {
		return employeeDAO.insertSalaryList();
	}
	
	@Override
	public Employee getEmployeeInfo(String empNo) throws EmployeeNotFoundException {
		Employee employee=employeeDAO.selectEmployeeInfo(empNo);
		if(employee==null) {
			throw new EmployeeNotFoundException("사원정보가 존재하지 않습니다.");
		}		
		return employee;
	}
	
	@Override
	public void loginAuth(Employee employee) throws LoginAuthFailException {
		Employee authEmpInfo=employeeDAO.selectEmployeeInfo(employee.getEmpNo());
		
		if(authEmpInfo==null) {
			throw new LoginAuthFailException(employee.getEmpNo(), "사원정보가 존재하지 않습니다.");
		}
		
		if(!BCrypt.checkpw(employee.getEmpPasswd(), authEmpInfo.getEmpPasswd())) {
			throw new LoginAuthFailException(employee.getEmpNo(), "사원번호가 없거나 비밀번호가 맞지 않습니다.");
		}
		
	}
	
	@ExceptionHandler(EmpExistsException.class)
	public String exceptionHandler(EmpExistsException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("employee", exception.getEmployee());
		return "login/login";
	}
	
	@ExceptionHandler(LoginAuthFailException.class)
	public String exceptionHandler(LoginAuthFailException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("empNo", exception.getEmpNo());
		return "login/login";
		
	}

}

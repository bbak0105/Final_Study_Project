package com.itwill.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.Loader.Simple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.itwill.dto.Employee;
import com.itwill.exception.EmpExistsException;
import com.itwill.exception.EmployeeNotFoundException;
import com.itwill.exception.LoginAuthFailException;
import com.itwill.service.EmployeeService;

@Controller
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	
	
	@Autowired
	private WebApplicationContext context;

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/insertEmp", method = RequestMethod.GET)
	public String insertEmp() {
		return "humanresource/insertEmployee";
	}

	// @RequestMapping(value = "/student/add", method = RequestMethod.POST)
	@RequestMapping(value = "/insertEmp", method = RequestMethod.POST)
	public String insertEmp(@ModelAttribute Employee employee)
			throws IllegalStateException, IOException, EmpExistsException {

		if (employee.getFile().isEmpty() || !employee.getFile().getContentType().equals("image/jpeg")) {
			return "humanresource/insertEmployee";
		}

		String empNo = "";
		int num = (int) (1000 * Math.random());
		String number = Integer.toString(num);
		Date now = new Date();
		SimpleDateFormat vans = new SimpleDateFormat("yyMMdd");
		String wdate = vans.format(now);
		empNo = "E" + wdate + "_" + number;

		String uploadDir = context.getServletContext().getRealPath("/WEB-INF/upload");
		String empPhoto = employee.getFile().getOriginalFilename();
		String empUpload = System.currentTimeMillis() + "";

		employee.getFile().transferTo(new File(uploadDir, empUpload));
		employee.setEmpPhoto(empPhoto);
		employee.setEmpUpload(empUpload);
		employee.setEmpNo(empNo);
		employeeService.insertEmployee(employee);

		return "redirect:/employeeList";
	}

	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String display(Model model) {
		model.addAttribute("employeeList", employeeService.getEmployeeList());
		return "humanresource/employeeList";
	}

	@RequestMapping(value = "/insertSalaryList", method = RequestMethod.GET)
	public String displaySalary(Model model) {
		model.addAttribute("insertSalaryList", employeeService.getInsertSalaryList());
		return "humanresource/insertSalaryList";
	}

	@RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
	public String viewEmployee(@RequestParam(value = "empNo", required = false) String empNo, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeNo(empNo));

		return "humanresource/viewEmployee";
	}

	@RequestMapping(value = "/updateEmp", method = RequestMethod.GET)
	public String updateEmp() {
		return "humanresource/viewEmployee";
	}

	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee employee, Model model) {
		try {
			employeeService.updateEmployee(employee);
		} catch (Exception e) {
			System.out.println("error = "+e.getMessage());
			return "humanresource/viewEmployee";
		}
		return "redirect:/employeeList";
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.GET)
	public String deleteEmp() {
		return "humanresource/viewEmployee";
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.POST)
	public String deleteEmp(@ModelAttribute Employee employee, Model model) {
		try {
			employeeService.deleteEmployee(employee);
		} catch (Exception e) {
			return "humanresource/viewEmployee";
		}
		return "redirect:/employeeList";
	}

	@RequestMapping(value = "/empoyee_search", method = RequestMethod.GET)
	public String empoyee_search(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("employeeList", employeeService.getDaynamicEmpList(employee));
		return "humanresource/employeeList";
	}

	@RequestMapping(value = "/empoyee_search2", method = RequestMethod.GET)
	public String empoyee_search2(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("insertSalaryList", employeeService.getDaynamicSalEmpList(employee));
		return "humanresource/insertSalaryList";
	}
	/*
	@RequestMapping(value ="/goWork", method = RequestMethod.GET)
	public String viewWork(@ModelAttribute Employee employee,Model model, HttpServletRequest requset) throws Exception {
		HttpSession session=requset.getSession();
		employee=(Employee)session.getAttribute("employee");
		model.addAttribute("employee", employeeService.getEmployeeInfo(employee.getEmpNo()));
		return "humanresource/goWork";
	}
	*/
	@RequestMapping(value ="/viewEmployee2", method = RequestMethod.GET)
	public String viewEmployee2(Model model, Employee employee, HttpSession session ) throws Exception {
		employee=(Employee)session.getAttribute("employee");
		model.addAttribute("employee", employeeService.getEmployeeInfo(employee.getEmpNo()));
		return "humanresource/viewEmployee2";
	}
	
	@RequestMapping(value ="/goWork", method = RequestMethod.GET)
	public String viewWork(Model model, Employee employee, HttpSession session ) throws Exception {
		employee=(Employee)session.getAttribute("employee");
		model.addAttribute("employee", employeeService.getEmployeeInfo(employee.getEmpNo()));
		return "humanresource/goWork";
	}
		
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login/login";
	}	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Employee employee, HttpSession session)
			throws LoginAuthFailException, EmployeeNotFoundException {

		employeeService.loginAuth(employee);

		session.setAttribute("employee", employeeService.getEmployeeInfo(employee.getEmpNo()));

		if (session.getAttribute("destURI") != null) {
			String destURI = (String) session.getAttribute("destURI");
			session.removeAttribute("destURI");
			return "redirect:" + destURI;
		}

		return "main/main";
	}
	
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
		
	}
	
	
	
	

}

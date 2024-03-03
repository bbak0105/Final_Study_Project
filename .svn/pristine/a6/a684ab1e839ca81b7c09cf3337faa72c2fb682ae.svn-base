package com.itwill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwill.dto.Attitude;
import com.itwill.dto.Authorization;
import com.itwill.dto.Salary;
import com.itwill.service.SalaryService;

@Controller
public class SalaryController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping(value = "/insertPay", method = RequestMethod.GET)
	public String insertPay(@RequestParam(value = "empNo", required = false)String empNo) {
		System.out.println(empNo);
		return "humanresource/insertSalary";
	}
	
	@RequestMapping(value = "/insertPay", method = RequestMethod.POST)
	public String insertPay( @ModelAttribute Salary salary, Model model) {
		try {			
			salaryService.insertSalary(salary);
		} catch (Exception e) {
			System.out.println("Exception ="+e.getMessage());
			return "humanresource/insertSalary";
		}
		return "redirect:/salarydetailList";
	}
	
	@RequestMapping(value = "/viewSalary", method = RequestMethod.GET)
	public String viewSalary(@RequestParam(value = "salNo", required = false)String salNo, Model model) {
		model.addAttribute("salary", salaryService.selectSalaryNo(salNo));
		
		return "humanresource/viewSalary";
	}
	
	
	@RequestMapping(value="/salarydetailList", method = RequestMethod.GET)
	public String display(Model model) {
		model.addAttribute("salaryList", salaryService.getSalaryList());
		return "humanresource/salarydetailList";
	}
	@RequestMapping(value="/salary_search",method=RequestMethod.GET)
	public String appr_search(@ModelAttribute Salary salary,Model model) {
		model.addAttribute("salaryList", salaryService.getDynamicSalaryList(salary));
		return "humanresource/salarydetailList";
	}
	
}

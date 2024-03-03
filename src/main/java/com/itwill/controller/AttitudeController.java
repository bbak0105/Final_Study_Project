package com.itwill.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.itwill.service.AttitudeService;
import com.itwill.service.AuthorizationService;

@Controller
public class AttitudeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@Autowired
	private AttitudeService attitudeService;
	
	@Autowired
	private AuthorizationService authorizationService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertAttitude() {
		return "/";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertAttitude(@ModelAttribute Attitude attitude, Model model) {
			
		String attdNo="";
			Date now = new Date();
			SimpleDateFormat vans=new SimpleDateFormat("yyyyMMddhhmmss");
			String wdate=vans.format(now);
			attdNo="N"+"_"+wdate;
			attitude.setAttdNo(attdNo);
			attitudeService.insertAttitude(attitude);
	
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/insertVacation", method = RequestMethod.GET)
	public String insertVacation() {
		return "authorization/viewAuthor";
	}
	
	@RequestMapping(value = "/insertVacation", method = RequestMethod.POST)
	public String insertVacation(@ModelAttribute Attitude attitude, @ModelAttribute Authorization authorization, Model model) {
			
		String attdNo="";
			Date now = new Date();
			SimpleDateFormat vans=new SimpleDateFormat("yyyyMMddhhmmss");
			String wdate=vans.format(now);
			attdNo="V"+"_"+wdate;
			attitude.setAttdNo(attdNo);
			attitudeService.insertVacation(attitude);
			authorizationService.approvalAuthorization(authorization);
	
		return "redirect:/approvalList";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateAttitude() {
		return "/";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateAttitude(@ModelAttribute Attitude attitude, Model model) {		

			attitudeService.updateAttitude(attitude);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/insertSalary", method = RequestMethod.GET)
	public String viewAttitude(@RequestParam(value = "empNo", required = false)String empNo, Model model) {
		model.addAttribute("empNo", empNo);
		model.addAttribute("attitude", attitudeService.selectAttdNo(empNo));
		System.out.println("empNo = "+empNo);
		model.addAttribute("author", authorizationService.selectAuthWhile(empNo));
	
		return "humanresource/insertSalary";
	}
	
	@RequestMapping(value="/attitudeList", method = RequestMethod.GET)
	public String attitudeList(Model model) {
		model.addAttribute("attitudeList", attitudeService.getAttdList());
		return "humanresource/attitudeList";
	}
	@RequestMapping(value="/attitude_search",method=RequestMethod.GET)
	public String appr_search(@ModelAttribute Attitude attitude,Model model) {
		model.addAttribute("attitudeList", attitudeService.getDaynamicAttdList(attitude));
		return "humanresource/attitudeList";
	}
	
	
}

package com.itwill.controller;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

import com.itwill.dto.Authorization;
import com.itwill.dto.Employee;
import com.itwill.service.AuthorizationService;
import com.itwill.service.EmployeeService;


@Controller
@SessionAttributes("authNo")
public class AuthorizationController {
	private static final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);
	
	@Autowired
	private WebApplicationContext context; 
	
	@Autowired
	private AuthorizationService authorizationService;
	
	@Autowired
	private EmployeeService employeeService;
	/*
	@RequestMapping(value = "/insertAuth", method = RequestMethod.GET)
	public String insertAuth() {
		return "authorization/insertAuthorization";
	}
	*/
	@RequestMapping(value ="/insertAuth", method = RequestMethod.GET)
	public String insertAuth(Model model, Employee employee, HttpSession session ) throws Exception {
		employee=(Employee)session.getAttribute("employee");
		model.addAttribute("employee", employeeService.getEmployeeInfo(employee.getEmpNo()));
		return "authorization/insertAuthorization";
	}
	
	@RequestMapping(value = "/insertAuth", method = RequestMethod.POST)
	public String insertAuth(@ModelAttribute Authorization authorization, Model model) throws IllegalStateException, IOException {
		
		
		String uploadDir=context.getServletContext().getRealPath("/WEB-INF/upload");
		String authFile=authorization.getFile().getOriginalFilename();
		String authUpload=System.currentTimeMillis()+"";
		
		authorization.getFile().transferTo(new File(uploadDir, authUpload));
		authorization.setAuthFile(authFile);
		authorization.setAuthUpload(authUpload);
		
			authorizationService.insertAuthorization(authorization);
		
		return "redirect:/approvalList";
	}
	
	@RequestMapping(value="/authorList", method = RequestMethod.GET)
	public String authorList(Model model) {
		model.addAttribute("authorList", authorizationService.getAuthList());
		return "authorization/authorList";
	}
	
	@RequestMapping(value="/approvalList", method = RequestMethod.GET)
	public String approvalList(Model model) {
		model.addAttribute("apprList", authorizationService.getApprList());
		return "authorization/approvalList";
	}
	/*
	@RequestMapping(value = "/apprAuth", method = RequestMethod.GET)
	public String apprAuth() {
		return "authorization/viewAuthor";
	}
	
	@RequestMapping(value = "/apprAuth", method = RequestMethod.POST)
	public String apprAuth(@ModelAttribute Authorization authorization, Model model) {		
		try {
			authorizationService.approvalAuthorization(authorization);
		} catch (Exception e) {
			return "authorization/viewAuthor";
		}
		return "redirect:/authorList";
	}
	*/
	@RequestMapping(value = "/deleteAuth", method = RequestMethod.GET)
	public String deleteAuth() {
		return "authorization/viewAuthor";
	}		
	
	@RequestMapping(value = "/deleteAuth", method = RequestMethod.POST)
	public String deleteAuth(@ModelAttribute Authorization authorization, Model model) {		
		try {
			authorizationService.deleteAuthorization(authorization);
		} catch (Exception e) {
			return "authorization/viewAuthor";
		}
		return "redirect:/authorList";
	}
	
	
	@RequestMapping(value = "/viewAuthor", method = RequestMethod.GET)
	public String viewAuthor(@RequestParam(value = "authNo", required = false)String authNo, Model model) {
		
		
		
		
		
		model.addAttribute("authorization", authorizationService.selectAthorNo(authNo));
		
		return "authorization/viewAuthor";
	}
	@RequestMapping(value="/auth_search",method=RequestMethod.GET)
	public String auth_search(@ModelAttribute Authorization authorization,Model model) {
		model.addAttribute("authorList", authorizationService.getDynamicAuthList(authorization));
		return "authorization/authorList";
	}
	@RequestMapping(value="/appr_search",method=RequestMethod.GET)
	public String appr_search(@ModelAttribute Authorization authorization,Model model) {
		model.addAttribute("apprList", authorizationService.getDynamicApprList(authorization));
		return "authorization/approvalList";
	}
	/*
	@RequestMapping("/fileDownload")
	public String fileDownload(@RequestParam(value = "authNo", required = false)String authNo, Model model) {
			
		Authorization authorization=authorizationService.selectAthorNo(authNo);
		System.out.println("====================================");
		System.out.println("authNo ="+authNo);
		System.out.println("====================================");
		Map<String, String> fileInfo=new HashMap<String, String>();

		fileInfo.put("uploadDir", context.getServletContext().getRealPath("/WEB-INF/upload"));
		fileInfo.put("uploadFilename", authorization.getAuthUpload());
		fileInfo.put("originFilename", authorization.getAuthFile());
		
		//다운로드 파일정보를 Spring Bean에게 제공
		model.addAttribute("downloadFile", fileInfo);
		
		//Spring Bean의 beanName 반환
		// => Spring Bean을 제공받아 응답처리하는 BeanNameViewResolver 필요 - servlet-context.xml
		return "fileDownload";
	}
	*/
	
	

	
	
}

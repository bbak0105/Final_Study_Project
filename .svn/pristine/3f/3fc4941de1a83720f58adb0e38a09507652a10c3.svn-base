package com.itwill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.dto.Approval;
import com.itwill.service.ApprovalService;

@Controller
public class ApprovalController {
	private static final Logger logger = LoggerFactory.getLogger(ApprovalController.class);
	
	@Autowired
	private ApprovalService approvalService;
	
	@RequestMapping(value = "/insertAppr", method = RequestMethod.GET)
	public String insertAppr() {
		return "authorization/viewAuthor";
	}
	
	@RequestMapping(value = "/insertAppr", method = RequestMethod.POST)
	public String insertAppr(@ModelAttribute Approval approval, Model model) {
		try {
			approvalService.insertApproval(approval);
		} catch (Exception e) {
			System.out.println("Exception ="+e.getMessage());
			return "authorization/viewAuthor";
		}
		return "redirect:/approvalList";
	}

}

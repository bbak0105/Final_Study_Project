package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.dto.Relout;
import com.itwill.service.ReloutService;

@Controller
public class ReloutController {
	
	@Autowired
	private ReloutService reloutService;
	
	@RequestMapping(value = "/relout", method = RequestMethod.GET)
	public String receipt(Model model) {
		
		model.addAttribute("relList", reloutService.getRelList());
		
		return "stock/relout";
	}
	
	@RequestMapping(value = "/relout", method = RequestMethod.POST)
	public String receipt(@ModelAttribute Relout relout, Model model) {
		
		model.addAttribute("relList", reloutService.getRelList());
		
		return "stock/relout";
	}
}

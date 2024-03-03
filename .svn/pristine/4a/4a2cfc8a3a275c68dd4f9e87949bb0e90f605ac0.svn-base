package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.service.ProductionService;

@Controller
public class ProductionController {
	
	@Autowired
	private ProductionService productionService;
	
	
	@RequestMapping(value = "/production", method = RequestMethod.GET)
	public String production(Model model) {
		
		model.addAttribute("productionList", productionService.getProductionList());
		
		return "production/production";
	}
}

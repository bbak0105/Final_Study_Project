package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	@RequestMapping(value = "/stock", method = RequestMethod.GET)
	public String stock(Model model) {
		
		model.addAttribute("stockList", stockService.getStockList());
		
		return "stock/stock";
	}
}

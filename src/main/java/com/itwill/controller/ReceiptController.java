package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.dto.Receipt;
import com.itwill.dto.Relout;
import com.itwill.dto.Stock;
import com.itwill.service.ReceiptService;
import com.itwill.service.ReloutService;
import com.itwill.service.StockService;

@Controller
public class ReceiptController {
	
	@Autowired
	private ReceiptService receiptService;
	
	@Autowired
	private ReloutService reloutService;
	
	@Autowired
	private StockService stockService;
	
	
	@RequestMapping(value = "/receipt", method = RequestMethod.GET)
	public String receipt(Model model) {
		
		model.addAttribute("rcpList", receiptService.getRcpList());
		model.addAttribute("poList", receiptService.getPoList());
		
		return "stock/receipt";
	}
	
	@RequestMapping(value = "/receipt", method = RequestMethod.POST)
	public String receipt(@ModelAttribute Receipt receipt, @ModelAttribute Relout relout, @ModelAttribute Stock stock, Model model) {
		
		receiptService.addRcp(receipt);
		reloutService.addRel(relout);
		stockService.addStock(stock);
		
		model.addAttribute("rcpList", receiptService.getRcpList());
		model.addAttribute("poList", receiptService.getPoList());
		
		return "stock/receipt";
	}
}

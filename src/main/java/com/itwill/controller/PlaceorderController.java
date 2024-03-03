package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

import com.itwill.dto.Placeorder;
import com.itwill.service.PlaceorderService;

@Controller
public class PlaceorderController {
	
	@Autowired
	private PlaceorderService placeorderService;
	
	
	@RequestMapping(value = "/placeorder", method = RequestMethod.GET)
	public String placeorder(Model model) {
		
		model.addAttribute("placeorderList", placeorderService.getPlaceorderList());
		model.addAttribute("poRList", placeorderService.getPoRList());
		model.addAttribute("poEmpList", placeorderService.getPoEmpList());
		model.addAttribute("poCltList", placeorderService.getPoCltList());
		
		return "placeorder/placeorder";
	}
	
	@RequestMapping(value = "/placeorder", method = RequestMethod.POST)
	public String placeorder(@ModelAttribute Placeorder placeorder, Model model) {
		
		placeorderService.addPlaceorder(placeorder);
		
		// XSS 공격에 대해 태그 관련 문자를 Escape 문자로 변환
		placeorder.setPoOrderNo(HtmlUtils.htmlEscape(placeorder.getPoOrderNo()));
		placeorder.setPoEmpNo(HtmlUtils.htmlEscape(placeorder.getPoEmpNo()));
		placeorder.setPoCltNo(HtmlUtils.htmlEscape(placeorder.getPoCltNo()));
		placeorder.setPoProduct(HtmlUtils.htmlEscape(placeorder.getPoProduct()));
		
		model.addAttribute("placeorderList", placeorderService.getPlaceorderList());
		model.addAttribute("poRList", placeorderService.getPoRList());
		model.addAttribute("poEmpList", placeorderService.getPoEmpList());
		model.addAttribute("poCltList", placeorderService.getPoCltList());
		
		return "placeorder/placeorder";
	}
	
	
	@RequestMapping(value = "/placeorder/poUpdate", method = RequestMethod.GET)
	public String placeorderUpdate(@RequestParam String poNo, Model model) {
		
		model.addAttribute("poSelect", placeorderService.getPoNo(poNo));
		
		return "placeorder/placeorder_update";
	}
	
	@RequestMapping(value = "/placeorder/poUpdate", method = RequestMethod.POST)
	public String placeorderUpdate(@ModelAttribute Placeorder placeorder, Model model) {
		
		placeorderService.modifyPlaceorder(placeorder);
		
		// XSS 공격에 대해 태그 관련 문자를 Escape 문자로 변환
		placeorder.setPoOrderNo(HtmlUtils.htmlEscape(placeorder.getPoOrderNo()));
		placeorder.setPoEmpNo(HtmlUtils.htmlEscape(placeorder.getPoEmpNo()));
		placeorder.setPoCltNo(HtmlUtils.htmlEscape(placeorder.getPoCltNo()));
		placeorder.setPoProduct(HtmlUtils.htmlEscape(placeorder.getPoProduct()));
		
		model.addAttribute("placeorderList", placeorderService.getPlaceorderList());
		model.addAttribute("poRList", placeorderService.getPoRList());
		model.addAttribute("poEmpList", placeorderService.getPoEmpList());
		model.addAttribute("poCltList", placeorderService.getPoCltList());
		
		return "placeorder/placeorder";
	}
	
	
	// 승인 처리
	@RequestMapping(value = "/authorization_po", method = RequestMethod.GET)
	public String authorizationPo(Model model) {
		
		model.addAttribute("placeorderList", placeorderService.getPoAutList());
		
		return "authorization/insertAuthorizationPo";
	}
	
	
	// 승인 처리
	@RequestMapping(value = "/authorization_po", method = RequestMethod.POST)
	public String authorizationPo(@ModelAttribute Placeorder placeorder , Model model) {
		
		placeorderService.modifyApprovalPlaceorder(placeorder);
		
		model.addAttribute("placeorderList", placeorderService.getPoAutList());
		
		return "authorization/insertAuthorizationPo";
	}
}

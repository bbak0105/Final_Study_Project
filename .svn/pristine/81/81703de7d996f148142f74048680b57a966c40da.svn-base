package com.itwill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import com.itwill.dto.Client;
import com.itwill.service.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public String Client(Model model) {
		
		model.addAttribute("clientList", clientService.getClientList());
		
		return "placeorder/client";
	}
	
	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public String Client(@ModelAttribute Client client, Model model) {
		
		// XSS 공격에 대해 태그 관련 문자를 Escape 문자로 변환
		client.setCltName(HtmlUtils.htmlEscape(client.getCltName()));
		client.setCltPhone(HtmlUtils.htmlEscape(client.getCltPhone()));
		client.setCltAdmin(HtmlUtils.htmlEscape(client.getCltAdmin()));
		
		clientService.addClient(client);
		
		model.addAttribute("clientList", clientService.getClientList());
		
		return "placeorder/client";
	}
	
	
	@RequestMapping(value = "/placeorder/cltUpdate", method = RequestMethod.GET)
	public String cltUpdate(@RequestParam String cltNo, Model model) {
		
		model.addAttribute("clientSelect", clientService.getClientNo(cltNo));
		
		return "placeorder/client_update";
	}
	
	@RequestMapping(value = "/placeorder/cltUpdate", method = RequestMethod.POST)
	public String cltUpdate(@ModelAttribute Client client, Model model) {
		
		clientService.modifyClient(client);
		
		model.addAttribute("clientList", clientService.getClientList());
		
		return "placeorder/client";
	}
	/*
	@ExceptionHandler(Exception.class)
	public String exceptionHeanler(Exception exception) {
		
		exception.printStackTrace();
		
		return null;
	}
	*/
}

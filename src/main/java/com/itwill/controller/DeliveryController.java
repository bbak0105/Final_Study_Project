package com.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwill.dto.Delivery;
import com.itwill.service.DeliveryService;


@Controller
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryService;
	
	@RequestMapping(value="/deliveryList", method = RequestMethod.GET)
	public String delivery(Model model) {
		
		model.addAttribute("deliveryList", deliveryService.getDeliveryList());
		model.addAttribute("transportList", deliveryService.getTransportList());
	//	System.out.println(deliveryService.getTransportList().size()+"=========================================");
		
		return "operation/deliveryList";
	}
	
	@RequestMapping(value="/delivery_search", method = RequestMethod.GET)
	public String delivery_search(@ModelAttribute Delivery delivery , Model model) {
		//System.out.println("µé¿Íµû!!!!!!!!!!!!!!!");
		if(delivery.getDeliDate()!=null || !delivery.getDeliDate().equals("")) {
			delivery.setDeliDate(delivery.getDeliDate().replace('-', '/'));
		}
		model.addAttribute("deliveryList", deliveryService.getDynamicProductList(delivery));
		System.out.println("==================="+delivery.getDeliStatus()+"===================================");
		model.addAttribute("transportList", deliveryService.getTransportList());
		return "operation/deliveryList";
	}
	
	@RequestMapping(value="/deli_update",method = {RequestMethod.PUT, RequestMethod.PATCH})
	@ResponseBody
	public String deli_update(@RequestBody Delivery delivery) {
		deliveryService.modifyDeliveryTransfort(delivery);
		return "success";
	}
	
	@RequestMapping(value="/deli_no", method = RequestMethod.GET)
	@ResponseBody
	public Delivery getDeliveryNo(@ModelAttribute Delivery deliver, Model model) {
		return deliveryService.selectDeliveryNoList(deliver);
	}

	/*
	 * @RequestMapping(value="/deliveryList", method = RequestMethod.GET) public
	 * String delivery_search(@ModelAttribute Delivery delivery, Model model) {
	 * model.addAttribute("deliveryList", deliveryService.getDeliveryList()); return
	 * "operation/deliveryList"; }
	 */
}

package com.itwill.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwill.dto.BootGridz;
import com.itwill.dto.Product;
import com.itwill.service.ProductService;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	//회원목록을 JSON 텍스트 데이타로 응답하는 요청 처리 메소드
	@RequestMapping(value="/json_list", method=RequestMethod.GET)
	@ResponseBody
	public List<Product> productListJSON(Model model) {		
		model.addAttribute("product",productService.getProductList());
		return productService.getProductList();
	}
	
	@RequestMapping(value="/json_product", method=RequestMethod.GET)
	public String productList_search(@ModelAttribute Product product,Model model) {
		model.addAttribute("productList",productService.getDynamicProductList(product));
		return "operation/productList";
	}
	
/*에이젝스 이용해서 상세검색 
	@RequestMapping(value="/json_product", method=RequestMethod.GET)
	@ResponseBody
	public List<Product> productListJSON_search(@ModelAttribute Product product,Model model) {
		model.addAttribute("product",productService.getDynamicProductList(product));
		return productService.getDynamicProductList(product);
	}
*/
	
	//출하하기 위한 메소드 -> 상태도 업데이트하고 insert도 해야함
	@RequestMapping(value="/product_updateStatus/{pdNo}", method = {RequestMethod.PUT, RequestMethod.PATCH})
	@ResponseBody
	public String goToDel(@PathVariable String pdNo) {
		productService.modifyGotoDelivery(pdNo);
		return "success";
	}
	
	//----select
	@RequestMapping(value="/productList", method = RequestMethod.GET)
	public String productList(Model model){
		model.addAttribute("productList", productService.getProductList());
		return "operation/productList";
	}
	
	@RequestMapping(value="/productList", method = RequestMethod.POST)
	public String productList(@ModelAttribute Product product, Model model){
		model.addAttribute("productList", productService.getDynamicProductList(product));
		return "operation/productList";
	}
	
	//상품 no를 받아와 가격을 수정할 수 있도록 하는 메소드
	@RequestMapping(value = "/product_modify",method = {RequestMethod.PUT, RequestMethod.PATCH})
	@ResponseBody
	public String productModify(@RequestBody Product product) {
		productService.modifyProductList(product);
		return "success";//성공하면 보내는 String값
	}
	
	@RequestMapping(value="/product_no/{pNo}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProductNo(@PathVariable String pNo) {
		return productService.getProductNoList(pNo);
	}
}

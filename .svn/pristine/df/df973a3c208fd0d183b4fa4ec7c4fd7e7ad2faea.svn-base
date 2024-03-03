package com.itwill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwill.dto.Member;
import com.itwill.service.MemberService;


//@Controller : Controller 클래스를 Spring Bean으로 등록하기 위한 어노테이션
//=> 클라이언트 요청에 대한 처리 기능을 제공받아 사용
//@Controller 어노테이션이 Spring Container에 의해 처리되도록 설정
//=> Bean Configuration File(servlet-context.xml)에서 component-scan 엘리먼트로 설정 
//Controller 클래스에 @RequestMapping 어노테이션을 사용하여 모든 요청 처리
//메소드의 요청 URL 주소 앞부분에 공통적으로 포함되는 문자열 설정 가능
@Controller
public class MemberController {
private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
   
   //Service 관련 클래스로 등록된 Spring Bean을 필드에 인젝션 처리하여 저장
   // => Controller 클래스의 메소드에서 Service 객체의 메소드 호출
   @Autowired
   private MemberService memberservice;
   
      
   @RequestMapping(value = "/memberList", method = RequestMethod.GET)
   public String display(Model model) {
      logger.info("memberList 메소드 호출");
      model.addAttribute("memberList", memberservice.getMemberList());
      return "member/memberList";
   }
	@RequestMapping(value="/member_search", method = RequestMethod.GET)
	public String member_search(@ModelAttribute Member member , Model model) {
		
		model.addAttribute("memberList", memberservice.getDynamicMemberList(member));
		return "member/memberList";
	}
   


}

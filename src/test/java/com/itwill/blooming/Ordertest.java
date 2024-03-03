package com.itwill.blooming;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.itwill.dto.Order;
import com.itwill.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class Ordertest {
	private static final Logger logger = LoggerFactory.getLogger(Ordertest.class);
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test1() {
		//logger.info("저장된 게시글이 하나도 없습니다.");
		List<Order> orderList = orderService.getOrderList();
		
		if(orderList.isEmpty()) {
			logger.info("저장된 게시글이 하나도 없습니다.");
		} else {
			for(Order order:orderList) {
				logger.info(order.getOrderNo());
			}
		}
		
	}
	
}

package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Order;

public interface OrderDAO {
	List<Order> selectOrderList();
	List<Order> selectOrderNoList(String orderNo);
	List<Order> selectOrderPersonList(String person);
	List<Order> selectOrderProductNameList(String productName);
	List<Order> selectOrderDateList(String orderDate);
	
	//µ¿ÀûÄõ¸®
	List<Order> selectDynamicOrderList(Order order);
	Order selectOrderDetail(String orderNo);
}

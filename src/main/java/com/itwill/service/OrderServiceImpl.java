package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.OrderDAO;
import com.itwill.dao.ProductDAO;
import com.itwill.dto.Order;
import com.itwill.dto.Product;

//Service 클래스 : 프로그램 작성에 필요한 기능을 제공하는 클래스
// => Service 클래스의 메소드는 DAO 클래스의 메소드를 호출하여 기능 구현

//@Service : Service 클래스를 Spring Bean으로 등록하기 위한 어노테이션
// => 예외 처리 기능을 제공받아 사용
//@Service 어노테이션이 Spring Container에 의해 처리되도록 설정
//=> Bean Configuration File(servlet-context.xml)에서 component-scan 엘리먼트로 설정 
@Service
public class OrderServiceImpl implements OrderService {
	//DAO 관련 클래스로 등록된 Spring Bean을 필드에 인젝션 처리하여 저장
	// => Service 클래스의 메소드에서 DAO 객체의 메소드 호출
	@Autowired
	private OrderDAO orderDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Order> getOrderList() {
		return orderDAO.selectOrderList();
	}

	@Override
	public List<Order> getOrderNoList(String orderNo) {
		return orderDAO.selectOrderNoList(orderNo);
	}

	@Override
	public List<Order> getOrderPersonList(String person) {
		return orderDAO.selectOrderPersonList(person);		
	}

	@Override
	public List<Order> getOrderProductNameList(String productName) {
		return orderDAO.selectOrderProductNameList(productName);
	}

	@Override
	public List<Order> getOrderDateList(String orderDate) {
		return orderDAO.selectOrderDateList(orderDate);
	}

	@Override
	public List<Order> getDynamicOrderList(Order order) {
		return orderDAO.selectDynamicOrderList(order);
	}

	@Override
	public Order getOrderDetail(String orderNo) {
		return orderDAO.selectOrderDetail(orderNo);
	}

	@Override
	public List<Product> getProductList() {
		return productDAO.selectProductList();
	}
	
}

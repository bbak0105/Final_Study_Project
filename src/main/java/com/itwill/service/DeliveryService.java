package com.itwill.service;

import java.util.List;

import com.itwill.dto.Delivery;
import com.itwill.dto.Transport;

public interface DeliveryService {
	//전체 검색
	List<Delivery> getDeliveryList();
	//동적쿼리
	List<Delivery> getDynamicProductList(Delivery delivery);
	Delivery selectDeliveryNoList(Delivery deliver);
	
	int modifyDeliveryStatus(String deliPdNo);
	int modifyDeliveryTransfort(Delivery delivery);
	
	List<Transport> getTransportList(); 
}

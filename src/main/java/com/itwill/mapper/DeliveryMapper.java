package com.itwill.mapper;

import java.util.List;

import com.itwill.dto.Delivery;

public interface DeliveryMapper {
	//전체 검색
	List<Delivery> selectDeliveryList();
	
	//동적쿼리
	List<Delivery> selectDynamicProductList(Delivery delivery);
	Delivery selectDeliveryNoList(Delivery deliver);
	
	//ListDeliselectDeliverNoList();
	int updateDeliveryStatus(String deliPdNo);
	int updateDeliveryTransfort(Delivery delivery);
}

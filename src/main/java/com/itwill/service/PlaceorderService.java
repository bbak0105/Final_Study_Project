package com.itwill.service;

import java.util.List;

import com.itwill.dto.Client;
import com.itwill.dto.Employee;
import com.itwill.dto.Order;
import com.itwill.dto.Placeorder;

public interface PlaceorderService {

	void addPlaceorder(Placeorder placeorder);
	void modifyPlaceorder(Placeorder placeorder);
	void modifyApprovalPlaceorder(Placeorder placeorder);
	List<Placeorder> getPlaceorderList();
	List<Placeorder> getPoAutList();
	Placeorder getPoNo(String poNo);
	List<Order> getPoRList();
	List<Employee> getPoEmpList();
	List<Client> getPoCltList();
}

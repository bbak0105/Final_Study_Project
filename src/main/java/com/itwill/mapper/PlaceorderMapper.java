package com.itwill.mapper;

import java.util.List;

import com.itwill.dto.Client;
import com.itwill.dto.Employee;
import com.itwill.dto.Order;
import com.itwill.dto.Placeorder;

public interface PlaceorderMapper {
	
	int insertPlaceorder(Placeorder placeorder);
	int updatePlaceorder(Placeorder placeorder);
	int updateApprovalPlaceorder(Placeorder placeorder);
	List<Placeorder> selectPlaceorderList();
	List<Placeorder> selectPoAutList();
	Placeorder selectPoNo(String poNo);
	List<Order> selectPoRList();
	List<Employee> selectPoEmpList();
	List<Client> selectPoCltList();
}

package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.PlaceorderDAO;
import com.itwill.dto.Client;
import com.itwill.dto.Employee;
import com.itwill.dto.Order;
import com.itwill.dto.Placeorder;

@Service
public class PlaceorderServiceImpl implements PlaceorderService {
	
	@Autowired
	private PlaceorderDAO placeorderDAO;
	
	
	@Override
	public void addPlaceorder(Placeorder placeorder) {
		placeorderDAO.insertPlaceorder(placeorder);
	}

	@Override
	public void modifyPlaceorder(Placeorder placeorder) {
		placeorderDAO.updatePlaceorder(placeorder);
	}

	@Override
	public List<Placeorder> getPlaceorderList() {
		return placeorderDAO.selectPlaceorderList();
	}

	@Override
	public List<Order> getPoRList() {
		return placeorderDAO.selectPoRList();
	}

	@Override
	public List<Employee> getPoEmpList() {
		return placeorderDAO.selectPoEmpList();
	}

	@Override
	public List<Client> getPoCltList() {
		return placeorderDAO.selectPoCltList();
	}

	@Override
	public Placeorder getPoNo(String poNo) {
		return placeorderDAO.selectPoNo(poNo);
	}

	@Override
	public void modifyApprovalPlaceorder(Placeorder placeorder) {
		placeorderDAO.updateApprovalPlaceorder(placeorder);
	}

	@Override
	public List<Placeorder> getPoAutList() {
		return placeorderDAO.selectPoAutList();
	}
}

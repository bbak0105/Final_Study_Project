package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.dao.DeliveryDAO;
import com.itwill.dao.TransportDAO;
import com.itwill.dto.Delivery;
import com.itwill.dto.Transport;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private DeliveryDAO deliveryDAO;
	
	@Autowired
	private TransportDAO transportDAO;

	@Override
	public List<Delivery> getDeliveryList() {
		return deliveryDAO.selectDeliveryList();
	}

	@Override
	public List<Delivery> getDynamicProductList(Delivery delivery) {
		return deliveryDAO.selectDynamicProductList(delivery);
	}

	@Transactional
	@Override
	public int modifyDeliveryStatus(String deliPdNo) {
		return deliveryDAO.updateDeliveryStatus(deliPdNo);
	}

	@Transactional
	@Override
	public int modifyDeliveryTransfort(Delivery delivery) {
		return deliveryDAO.updateDeliveryTransfort(delivery);
	}

	@Override
	public Delivery selectDeliveryNoList(Delivery deliver) {
		return deliveryDAO.selectDeliveryNoList(deliver);
	}

	@Override
	public List<Transport> getTransportList() {
		return transportDAO.selectTransprotList();
	}
}

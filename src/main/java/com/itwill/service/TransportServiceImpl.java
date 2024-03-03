package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.dao.TransportDAO;
import com.itwill.dto.Transport;

@Service
public class TransportServiceImpl implements TransportService {

	@Autowired
	private TransportDAO transportDAO;
	
	@Override
	public List<Transport> getTransprotList() {
		return transportDAO.selectTransprotList();
	}

	@Override
	public List<Transport> getDynamicTransprotList(Transport transport) {
		return transportDAO.selectDynamicTransprotList(transport);		
	}

	@Transactional
	@Override
	public int addTransport(Transport transport) {
		return transportDAO.insertTransport(transport);
	}

	@Override
	public Transport getTransprotDoubleCheck(String tpNo) {
		return transportDAO.selectTransprotDoubleCheck(tpNo);
	}

	@Transactional
	@Override
	public int modifyTransport(Transport transport) {
		return transportDAO.updateTransport(transport);
	}

}

package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.dao.ReceiptDAO;
import com.itwill.dto.Placeorder;
import com.itwill.dto.Receipt;

@Service
public class ReceiptServiceImpl implements ReceiptService {
	
	@Autowired
	private ReceiptDAO receiptDAO;
	
	
	@Override
	@Transactional
	public int addRcp(Receipt receipt) {
		return receiptDAO.insertRcp(receipt);
	}

	@Override
	public Receipt getCearchRcp(String rcpNo) {
		return receiptDAO.selectCearchRcp(rcpNo);
	}

	@Override
	public List<Receipt> getRcpList() {
		return receiptDAO.selectRcpList();
	}

	@Override
	public List<Placeorder> getPoList() {
		return receiptDAO.selectPoList();
	}
}

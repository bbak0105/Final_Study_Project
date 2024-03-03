package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.dao.StockDAO;
import com.itwill.dto.Stock;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StockDAO stockDAO;
	
	
	@Override
	public List<Stock> getStockList() {
		return stockDAO.selectStockList();
	}

	@Override
	@Transactional
	public void addStock(Stock stock) {
		stockDAO.insertStock(stock);
	}

	@Override
	@Transactional
	public void modifyDelStock(Stock stock) {
		stockDAO.updateDelStock(stock);
	}

	@Override
	@Transactional
	public void modiftStock(Stock stock) {
		stockDAO.updateStock(stock);
	}
}

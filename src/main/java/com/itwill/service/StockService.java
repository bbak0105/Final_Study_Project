package com.itwill.service;

import java.util.List;

import com.itwill.dto.Stock;

public interface StockService {
	
	void addStock(Stock stock);
	void modifyDelStock(Stock stock);
	void modiftStock(Stock stock);
	List<Stock> getStockList();
}

package com.itwill.mapper;

import java.util.List;

import com.itwill.dto.Stock;

public interface StockMapper {
	
	int insertStock(Stock stock);
	int updateDelStock(Stock stock);
	int updateStock(Stock stock);
	List<Stock> selectStockList();
}

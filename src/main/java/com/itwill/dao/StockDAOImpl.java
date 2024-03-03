package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Stock;
import com.itwill.mapper.StockMapper;

@Repository
public class StockDAOImpl implements StockDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int insertStock(Stock stock) {
		return sqlSession.getMapper(StockMapper.class).insertStock(stock);
	}

	@Override
	public int updateDelStock(Stock stock) {
		return sqlSession.getMapper(StockMapper.class).updateDelStock(stock);
	}

	@Override
	public int updateStock(Stock stock) {
		return sqlSession.getMapper(StockMapper.class).updateStock(stock);
	}

	@Override
	public List<Stock> selectStockList() {
		return sqlSession.getMapper(StockMapper.class).selectStockList();
	}
}

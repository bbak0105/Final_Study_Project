package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Placeorder;
import com.itwill.dto.Receipt;
import com.itwill.mapper.ReceiptMapper;

@Repository
public class ReceiptDAOImpl implements ReceiptDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int insertRcp(Receipt receipt) {
		return sqlSession.getMapper(ReceiptMapper.class).insertRcp(receipt);
	}

	@Override
	public Receipt selectCearchRcp(String rcpNo) {
		return sqlSession.getMapper(ReceiptMapper.class).selectCearchRcp(rcpNo);
	}

	@Override
	public List<Receipt> selectRcpList() {
		return sqlSession.getMapper(ReceiptMapper.class).selectRcpList();
	}

	@Override
	public List<Placeorder> selectPoList() {
		return sqlSession.getMapper(ReceiptMapper.class).selectPoList();
	}
}

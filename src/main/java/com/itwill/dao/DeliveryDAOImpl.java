package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.mapper.DeliveryMapper;
import com.itwill.dto.Delivery;

@Repository
public class DeliveryDAOImpl implements DeliveryDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Delivery> selectDeliveryList() {
		return sqlSession.getMapper(DeliveryMapper.class).selectDeliveryList();
	}

	@Override
	public List<Delivery> selectDynamicProductList(Delivery delivery) {		
		return sqlSession.getMapper(DeliveryMapper.class).selectDynamicProductList(delivery);
	}

	@Override
	public int updateDeliveryStatus(String deliPdNo) {
		return sqlSession.getMapper(DeliveryMapper.class).updateDeliveryStatus(deliPdNo);
	}

	@Override
	public int updateDeliveryTransfort(Delivery delivery) {
		return sqlSession.getMapper(DeliveryMapper.class).updateDeliveryTransfort(delivery);
	}

	@Override
	public Delivery selectDeliveryNoList(Delivery deliver) {
		return sqlSession.getMapper(DeliveryMapper.class).selectDeliveryNoList(deliver);
	}
	
}

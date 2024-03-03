package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Production;
import com.itwill.mapper.ProductionMapper;

@Repository
public class ProductionDAOImpl implements ProductionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Production> selectProductionList() {
		return sqlSession.getMapper(ProductionMapper.class).selectProductionList();
	}

	@Override
	public int insertProduction(Production production) {
		return sqlSession.getMapper(ProductionMapper.class).insertProduction(production);
	}
}

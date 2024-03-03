package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Transport;
import com.itwill.mapper.TransportMapper;

@Repository
public class TransportDAOImpl implements TransportDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Transport> selectTransprotList() {
		return sqlSession.getMapper(TransportMapper.class).selectTransprotList();
	}

	@Override
	public List<Transport> selectDynamicTransprotList(Transport transport) {
		return sqlSession.getMapper(TransportMapper.class).selectDynamicTransprotList(transport);
	}

	@Override
	public int insertTransport(Transport transport) {
		return sqlSession.getMapper(TransportMapper.class).insertTransport(transport);
	}

	@Override
	public Transport selectTransprotDoubleCheck(String tpNo) {
		return sqlSession.getMapper(TransportMapper.class).selectTransprotDoubleCheck(tpNo);
	}

	@Override
	public int updateTransport(Transport transport) {
		return sqlSession.getMapper(TransportMapper.class).updateTransport(transport);
	}
	
}

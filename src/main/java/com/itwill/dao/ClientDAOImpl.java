package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Client;
import com.itwill.mapper.ClientMapper;

@Repository
public class ClientDAOImpl implements ClientDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Client> selectClientList() {
		return sqlSession.getMapper(ClientMapper.class).selectClientList();
	}

	@Override
	public int insertClient(Client client) {
		return sqlSession.getMapper(ClientMapper.class).insertClient(client);
	}

	@Override
	public Client selectClient(Client client) {
		return sqlSession.getMapper(ClientMapper.class).selectClient(client);
	}

	@Override
	public Client selectClientNo(String cltNo) {
		return sqlSession.getMapper(ClientMapper.class).selectClientNo(cltNo);
	}

	@Override
	public int updateClient(Client client) {
		return sqlSession.getMapper(ClientMapper.class).updateClient(client);
	}
}

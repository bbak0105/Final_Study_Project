package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Client;
import com.itwill.dto.Employee;
import com.itwill.dto.Order;
import com.itwill.dto.Placeorder;
import com.itwill.mapper.PlaceorderMapper;

@Repository
public class PlaceorderDAOImpl implements PlaceorderDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int insertPlaceorder(Placeorder placeorder) {
		return sqlSession.getMapper(PlaceorderMapper.class).insertPlaceorder(placeorder);
	}

	@Override
	public int updatePlaceorder(Placeorder placeorder) {
		return sqlSession.getMapper(PlaceorderMapper.class).updatePlaceorder(placeorder);
	}

	@Override
	public List<Placeorder> selectPlaceorderList() {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPlaceorderList();
	}

	@Override
	public List<Order> selectPoRList() {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPoRList();
	}

	@Override
	public List<Employee> selectPoEmpList() {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPoEmpList();
	}

	@Override
	public List<Client> selectPoCltList() {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPoCltList();
	}

	@Override
	public Placeorder selectPoNo(String poNo) {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPoNo(poNo);
	}

	@Override
	public int updateApprovalPlaceorder(Placeorder placeorder) {
		return sqlSession.getMapper(PlaceorderMapper.class).updateApprovalPlaceorder(placeorder);
	}

	@Override
	public List<Placeorder> selectPoAutList() {
		return sqlSession.getMapper(PlaceorderMapper.class).selectPoAutList();
	}
}

package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Relout;
import com.itwill.mapper.ReloutMapper;

@Repository
public class ReloutDAOImpl implements ReloutDAO {
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public int insertRel(Relout relout) {
		return sqlSession.getMapper(ReloutMapper.class).insertRel(relout);
	}

	@Override
	public List<Relout> selectRelList() {
		return sqlSession.getMapper(ReloutMapper.class).selectRelList();
	}
}

package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Relout;

public interface ReloutDAO {
	
	int insertRel(Relout relout);
	List<Relout> selectRelList();
}

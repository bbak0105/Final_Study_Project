package com.itwill.service;

import java.util.List;

import com.itwill.dto.Relout;

public interface ReloutService {
	
	int addRel(Relout relout);
	List<Relout> getRelList();
}

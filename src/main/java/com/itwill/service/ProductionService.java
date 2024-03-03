package com.itwill.service;

import java.util.List;

import com.itwill.dto.Production;

public interface ProductionService {
	
	List<Production> getProductionList();
	void addProduction(Production production);
}

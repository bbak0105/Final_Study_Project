package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.ProductionDAO;
import com.itwill.dto.Production;

@Service
public class ProductionServiceImpl implements ProductionService {
	
	@Autowired
	private ProductionDAO productionDAO;
	
	
	@Override
	public List<Production> getProductionList() {
		return productionDAO.selectProductionList();
	}

	@Override
	public void addProduction(Production production) {
		productionDAO.insertProduction(production);
	}
}

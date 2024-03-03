package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.DeliveryDAO;
import com.itwill.dao.ProductDAO;
import com.itwill.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private DeliveryDAO deliveryDAO;
	
	@Override
	public List<Product> getProductList() {
		return productDAO.selectProductList(); 
	}

	@Override
	public List<Product> getDynamicProductList(Product product) {
		return productDAO.selectDynamicProductList(product);
	}

	@Override
	public int modifyProductList(Product product) {
		return productDAO.updateProductList(product);
	}

	@Override
	public Product getProductNoList(String pNo) {
		return productDAO.selectProductNoList(pNo);
	}

	@Override
	public int modifyGotoDelivery(String pNo) {
		deliveryDAO.updateDeliveryStatus(pNo);
		return productDAO.updateGotoDelivery(pNo);
	}

	/*
	 * @Override public int addFromProductToDelivery(Product product) { //상품pk를 보내줘서
	 * delivery 객체를 받아오는 DAO를 가져온다 return ; }
	 */
}

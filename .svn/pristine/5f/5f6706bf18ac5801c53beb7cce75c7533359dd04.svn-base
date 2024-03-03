package com.itwill.service;

import java.util.List;

import com.itwill.dto.Product;

public interface ProductService {
	List<Product> getProductList();
	
	//동적쿼리
	List<Product> getDynamicProductList(Product product);
	
	//가격 업데이트문
	int modifyProductList(Product product);
	
	//pdNo값을 가져와서 검색하는 기능
	Product getProductNoList(String pNo);
	
	int modifyGotoDelivery(String pNo);
	
	//상품에서 배송테이블로 넣기
	//int addFromProductToDelivery(Product product);
}

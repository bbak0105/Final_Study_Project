package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Product;

public interface ProductDAO {
	List<Product> selectProductList();
	
	//동적쿼리
	List<Product> selectDynamicProductList(Product product);
	
	//가격 업데이트문
	int updateProductList(Product product);
	
	//pdNo값을 가져와서 검색하는 기능
	Product selectProductNoList(String pNo);
	
	int updateGotoDelivery(String pNo);
	
	//상품에서 배송테이블로 넣기
	int insertFromProductToDelivery(Product product);
}

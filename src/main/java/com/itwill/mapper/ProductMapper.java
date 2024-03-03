package com.itwill.mapper;

import java.util.List;

import com.itwill.dto.Product;

public interface ProductMapper {
	//전체 목록 검색
	List<Product> selectProductList();
	
	//동적쿼리
	List<Product> selectDynamicProductList(Product product);
	
	//가격 업데이트문-> 업데이트에 필요한 데이터가 product DTO에 다 담겨있으므로 DTO를 파라미터로 받는다
	int updateProductList(Product product);
	
	//pdNo값을 가져와서 검색하는 기능
	Product selectProductNoList(String pNo);
	
	int updateGotoDelivery(String pNo);
	
	//상품에서 배송테이블로 넣기
	int insertFromProductToDelivery(Product product);
}

package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Product;
import com.itwill.mapper.ProductMapper;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Product> selectProductList() {
		return sqlSession.getMapper(ProductMapper.class).selectProductList();
	}

	@Override
	public List<Product> selectDynamicProductList(Product product) {
		return sqlSession.getMapper(ProductMapper.class).selectDynamicProductList(product);
	}

	@Override
	public int updateProductList(Product product) {
		return sqlSession.getMapper(ProductMapper.class).updateProductList(product);
	}

	@Override
	public Product selectProductNoList(String pNo) {
		return sqlSession.getMapper(ProductMapper.class).selectProductNoList(pNo);
	}

	@Override
	public int updateGotoDelivery(String pNo) {
		return sqlSession.getMapper(ProductMapper.class).updateGotoDelivery(pNo);
	}

	@Override
	public int insertFromProductToDelivery(Product product) {
		return sqlSession.getMapper(ProductMapper.class).insertFromProductToDelivery(product);
	}

}

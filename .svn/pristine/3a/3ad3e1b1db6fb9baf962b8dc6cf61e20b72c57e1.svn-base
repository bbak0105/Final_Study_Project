package com.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.dto.Order;
import com.itwill.mapper.OrderMapper;

//DAO 클래스 : 정보에 대한 삽입,삭제,변경,검색 기능을 제공하는 클래스
// => DBMS 서버에 SQL 명령을 전달하여 실행된 결과를 반환하는 기능의 메소드 작성

//MyBatis Framework를 이용한 DAO 클래스 작성
//1.MyBatis 관련 라이브러리 빌드 처리 - pom.xml
//2.SqlSessionFactory 클래스와 SqlSession 클래스를 Spring Bean으로 등록
// => Bean Configuration File(root-context.xml)에서 bean 엘리먼트로 설정  
//3.Mapper 파일 작성 - XML Mapper 파일과 Interface Mapper 파일을 바인딩하여 작성
//4.DAO 클래스의 메소드에서 Mapper 파일에 등록된 SQL 명령으로 실행하고 결과를 제공받아 반환
// => SqlSession 관련 Spring Bean을 사용할 수 있도록 필드에 인젝션 처리

//Mybatis Framework에서 제공되는 로그를 Spring 로그 구현체로 기록되도록 설정하는 방법
//1.log4jdbc-log4j2-jdbc4 라이브러리 빌드 처리 - pom.xml
//2.DataSource 관련 Spring Bean 등록시 driverClassName 필드와 url 필드를 변경하여 인젝션 처리 - root-context.xml
//3.resources 패키지 폴더에 log4jdbc.log4j2.properties 파일 작성
//4.log4j.xml 파일에서 로그 이벤트에 대한 기록 설정

//@Repository : DAO 클래스를 Spring Bean으로 등록하기 위한 어노테이션
// => 트렌젝션 관련 기능을 제공받아 사용
//@Repository 어노테이션이 Spring Container에 의해 처리되도록 설정
// => Bean Configuration File(servlet-context.xml)에서 component-scan 엘리먼트로 설정 
@Repository
public class OrderDAOImpl implements OrderDAO {
	//SqlSession 관련 클래스로 등록된 Spring Bean을 필드에 인젝션 처리하여 저장
	// => DAO 클래스의 메소드에서 SqlSession 객체의 메소드 호출
	//@Autowired 어노테이션과 @Qualifier 어노테이션을 이용하여 자동 인젝션 처리
	// => 필드마다 인젝션 관련 어노테이션 설정
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Order> selectOrderList() {
		return sqlSession.getMapper(OrderMapper.class).selectOrderList();
	}

	@Override
	public List<Order> selectOrderNoList(String orderNo) {
		return sqlSession.getMapper(OrderMapper.class).selectOrderNoList(orderNo);
	}

	@Override
	public List<Order> selectOrderPersonList(String person) {
		return sqlSession.getMapper(OrderMapper.class).selectOrderPersonList(person);		
	}

	@Override
	public List<Order> selectOrderProductNameList(String productName) {
		return sqlSession.getMapper(OrderMapper.class).selectOrderProductNameList(productName);		
	}

	@Override
	public List<Order> selectOrderDateList(String orderDate) {
		return sqlSession.getMapper(OrderMapper.class).selectOrderDateList(orderDate);	
	}

	@Override
	public List<Order> selectDynamicOrderList(Order order) {
		return sqlSession.getMapper(OrderMapper.class).selectDynamicOrderList(order);
	}

	@Override
	public Order selectOrderDetail(String orderNo) {
		return sqlSession.getMapper(OrderMapper.class).selectOrderDetail(orderNo);
	}
}

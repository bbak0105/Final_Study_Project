package com.itwill.service;
import java.util.List;
import com.itwill.dto.Sales;

public interface SalesService {
	
	//기간 검색
	List<Sales> getTermList(Sales sales);
	
	//주간검색
	List<Sales> getWeekList();
	
	//월 검색
	List<Sales> getMonthList();
	
	//주간최대매출
	List<Sales> getWeekMax();
			
	//주간최소매출
	List<Sales> getWeekMin();
			
	//주간총매출
	List<Sales> getWeekEntire();
			
	//주간평균매출
	List<Sales> getWeekAvg();
			
	//월간최대매출
	List<Sales> getMonthMax();
			
	//월간최소매출
	List<Sales> getMonthMin();
			
	//월간총매출
	List<Sales> getMonthEntire();
			
	//월간평균매출
	List<Sales> getMonthAvg();
	
	//기간베스트 아이템
	List<Sales> getBestItem(Sales sales);
	
	//기간워스트 아이템
	List<Sales> getWorstIme(Sales sales);
	
	//기간총매출
	List<Sales> getTermTotal(Sales sales);
	
	//기간평균매출
	List<Sales> getTermAvg(Sales sales);
	
	//현재월
	List<Sales> getNowMonth();
	
	//베스트셀러 메인
	List<Sales> getNowBest();
	
	//메인페이지 총 주문수
	List<Sales> getTotalOrder();
	
	//메인페이지 총 발주량
	List<Sales> getTotalRelout();
	
	//메인페이지 이번달 매출
	List<Sales> getNowmonthSales();
	
	//메인페이지 저번달 매출
	List<Sales> getLastmonthSales();
	
	//메인페이지 이번분기 매출
	List<Sales> getNowbunSales();
	
	//메인페이지 저번분기 매출
	List<Sales> getLastbunSales();
	
	//메인페이지 이번년 매출
	List<Sales> getNowyearSales();
	
	//메인페이지 작년 매출
	List<Sales> getLastyearSales();
}

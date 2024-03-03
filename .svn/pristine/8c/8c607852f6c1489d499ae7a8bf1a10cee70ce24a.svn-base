package com.itwill.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itwill.dao.SalesDAO;
import com.itwill.dto.Sales;

@Service
public class SalesServiceImpl implements SalesService{
	
	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public List<Sales> getTermList(Sales sales) {
		return salesDAO.selectTermList(sales);
	}
	
	@Override
	public List<Sales> getMonthList() {
		return salesDAO.selectMonthList();
	}

	@Override
	public List<Sales> getWeekList() {
		return salesDAO.selectWeekList();
	}

	@Override
	public List<Sales> getWeekMax() {
		return salesDAO.selectWeekMax();
	}

	@Override
	public List<Sales> getWeekMin() {
		return salesDAO.selectWeekMin();
	}

	@Override
	public List<Sales> getWeekEntire() {
		return salesDAO.selectWeekEntire();
	}

	@Override
	public List<Sales> getWeekAvg() {
		return salesDAO.selectWeekAvg();
	}

	@Override
	public List<Sales> getMonthMax() {
		return salesDAO.selectMonthMax();
	}

	@Override
	public List<Sales> getMonthMin() {
		return salesDAO.selectMonthMin();
	}

	@Override
	public List<Sales> getMonthEntire() {
		return salesDAO.selectMonthEntire();
	}

	@Override
	public List<Sales> getMonthAvg() {
		return salesDAO.selectMonthAvg();
	}

	@Override
	public List<Sales> getBestItem(Sales sales) {
		return salesDAO.selectBestItem(sales);
	}

	@Override
	public List<Sales> getWorstIme(Sales sales) {
		return salesDAO.selectWorstIme(sales);
	}

	@Override
	public List<Sales> getTermTotal(Sales sales) {
		return salesDAO.selectTermTotal(sales);
	}

	@Override
	public List<Sales> getTermAvg(Sales sales) {
		return salesDAO.selectTermAvg(sales);
	}

	@Override
	public List<Sales> getNowMonth() {
		return salesDAO.selectNowMonth();
	}

	@Override
	public List<Sales> getNowBest() {
		return salesDAO.selectNowBest();
	}

	@Override
	public List<Sales> getTotalOrder() {
		return salesDAO.selectTotalOrder();
	}

	@Override
	public List<Sales> getTotalRelout() {
		return salesDAO.selectTotalRelout();
	}

	@Override
	public List<Sales> getNowmonthSales() {
		return salesDAO.selectNowmonthSales();
	}

	@Override
	public List<Sales> getLastmonthSales() {
		return salesDAO.selectLastmonthSales();
	}

	@Override
	public List<Sales> getNowbunSales() {
		return salesDAO.selectNowbunSales();
	}

	@Override
	public List<Sales> getLastbunSales() {
		return salesDAO.selectLastbunSales();
	}

	@Override
	public List<Sales> getNowyearSales() {
		return salesDAO.selectNowyearSales();
	}

	@Override
	public List<Sales> getLastyearSales() {
		return salesDAO.selectLastyearSales();
	}


}

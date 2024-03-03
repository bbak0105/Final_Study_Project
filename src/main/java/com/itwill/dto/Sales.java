package com.itwill.dto;

//출고테이블,상품테이블,생산테이블(상품명)을 조인하여 값을 뽑기 위해 만드는 dto
public class Sales {
	private Relout relout;
	private Product product;
	private Production production;

	private int rawPrice;
	private int totalSales;
	private int pureSales;
	private int nowMonth;
	private int maxiSales;
	private int entireSales;
	private int avgSales;
	private int totalBestworst;
	
	private String startDate;
	private String endDate;
	
	private int nowmonthSales;
	private int lastmonthSales;
	private int nowbunSales;
	private int lastbunSales;
	private int nowyearSales;
	private int lastyearSales;
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public Relout getRelout() {
		return relout;
	}

	public void setRelout(Relout relout) {
		this.relout = relout;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Production getProduction() {
		return production;
	}

	public void setProduction(Production production) {
		this.production = production;
	}

	public int getRawPrice() {
		return rawPrice;
	}

	public void setRawPrice(int rawPrice) {
		this.rawPrice = rawPrice;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public int getPureSales() {
		return pureSales;
	}

	public void setPureSales(int pureSales) {
		this.pureSales = pureSales;
	}

	public int getNowMonth() {
		return nowMonth;
	}

	public void setNowMonth(int nowMonth) {
		this.nowMonth = nowMonth;
	}

	public int getMaxiSales() {
		return maxiSales;
	}

	public void setMaxiSales(int maxiSales) {
		this.maxiSales = maxiSales;
	}

	public int getEntireSales() {
		return entireSales;
	}

	public void setEntireSales(int entireSales) {
		this.entireSales = entireSales;
	}

	public int getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(int avgSales) {
		this.avgSales = avgSales;
	}

	public int getTotalBestworst() {
		return totalBestworst;
	}

	public void setTotalBestworst(int totalBestworst) {
		this.totalBestworst = totalBestworst;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getNowmonthSales() {
		return nowmonthSales;
	}

	public void setNowmonthSales(int nowmonthSales) {
		this.nowmonthSales = nowmonthSales;
	}

	public int getLastmonthSales() {
		return lastmonthSales;
	}

	public void setLastmonthSales(int lastmonthSales) {
		this.lastmonthSales = lastmonthSales;
	}

	public int getLastbunSales() {
		return lastbunSales;
	}

	public void setLastbunSales(int lastbunSales) {
		this.lastbunSales = lastbunSales;
	}

	public int getNowbunSales() {
		return nowbunSales;
	}

	public void setNowbunSales(int nowbunSales) {
		this.nowbunSales = nowbunSales;
	}

	public int getNowyearSales() {
		return nowyearSales;
	}

	public void setNowyearSales(int nowyearSales) {
		this.nowyearSales = nowyearSales;
	}

	public int getLastyearSales() {
		return lastyearSales;
	}

	public void setLastyearSales(int lastyearSales) {
		this.lastyearSales = lastyearSales;
	}
	
}
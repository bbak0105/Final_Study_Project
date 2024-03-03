package com.itwill.dto;


/*
이름               널?       유형           
---------------- -------- ------------ 
STOCK_NO         NOT NULL VARCHAR2(20) 
STOCK_RCP_NO              VARCHAR2(20) 
STOCK_REL_NO              VARCHAR2(20) 
STOCK_NAME                VARCHAR2(50) 
STOCK_CNT                 NUMBER       
STOCK_IN_DATE             VARCHAR2(50) 
STOCK_STATUS              NUMBER       
STOCK_PRICE               NUMBER       
STOCK_SALE_PRICE          NUMBER   
*/

public class Stock {
	
	private String stockNo;
	private String stockRcpNo;
	private String stockRelNo;
	private String stockName;
	private int stockCnt;
	private String stockInDate;
	private int stockStatus;
	private int stockPrice;
	private int stockSalePrice;
	
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getStockNo() {
		return stockNo;
	}

	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	public String getStockRcpNo() {
		return stockRcpNo;
	}

	public void setStockRcpNo(String stockRcpNo) {
		this.stockRcpNo = stockRcpNo;
	}

	public String getStockRelNo() {
		return stockRelNo;
	}

	public void setStockRelNo(String stockRelNo) {
		this.stockRelNo = stockRelNo;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockCnt() {
		return stockCnt;
	}

	public void setStockCnt(int stockCnt) {
		this.stockCnt = stockCnt;
	}

	public String getStockInDate() {
		return stockInDate;
	}

	public void setStockInDate(String stockInDate) {
		this.stockInDate = stockInDate;
	}

	public int getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(int stockStatus) {
		this.stockStatus = stockStatus;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public int getStockSalePrice() {
		return stockSalePrice;
	}

	public void setStockSalePrice(int stockSalePrice) {
		this.stockSalePrice = stockSalePrice;
	}
}

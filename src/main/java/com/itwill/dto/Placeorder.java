package com.itwill.dto;

import java.util.List;

/*
이름          널?       유형           
----------- -------- ------------ 
PO_NO       NOT NULL VARCHAR2(20) 
PO_ORDER_NO          VARCHAR2(20) // 주문관리
PO_EMP_NO            VARCHAR2(20) // 사원
PO_CLT_NO            VARCHAR2(20) // 거래처
PO_PRODUCT           VARCHAR2(50) 
PO_CNT               NUMBER       
PO_PRICE             NUMBER       
PO_DATE              VARCHAR2(20) 
PO_STATUS            NUMBER       
PO_PERMIT            NUMBER      
*/

public class Placeorder {
	
	private String poNo;
	private String poOrderNo;
	private String poEmpNo;
	private String poCltNo;
	private String poProduct;
	private int poCnt;
	private int poPrice;
	private String poDate;
	private int poStatus;
	private int poPermit;
	
	private List<Order> order;
	private List<Employee> employee;
	private List<Client> client;
	

	public Placeorder() {
		// TODO Auto-generated constructor stub
	}

	
	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getPoOrderNo() {
		return poOrderNo;
	}

	public void setPoOrderNo(String poOrderNo) {
		this.poOrderNo = poOrderNo;
	}

	public String getPoEmpNo() {
		return poEmpNo;
	}

	public void setPoEmpNo(String poEmpNo) {
		this.poEmpNo = poEmpNo;
	}

	public String getPoCltNo() {
		return poCltNo;
	}

	public void setPoCltNo(String poCltNo) {
		this.poCltNo = poCltNo;
	}

	public String getPoProduct() {
		return poProduct;
	}

	public void setPoProduct(String poProduct) {
		this.poProduct = poProduct;
	}

	public int getPoCnt() {
		return poCnt;
	}

	public void setPoCnt(int poCnt) {
		this.poCnt = poCnt;
	}

	public int getPoPrice() {
		return poPrice;
	}

	public void setPoPrice(int poPrice) {
		this.poPrice = poPrice;
	}

	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public int getPoStatus() {
		return poStatus;
	}

	public void setPoStatus(int poStatus) {
		this.poStatus = poStatus;
	}

	public int getPoPermit() {
		return poPermit;
	}

	public void setPoPermit(int poPermit) {
		this.poPermit = poPermit;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}
}

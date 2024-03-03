package com.itwill.dto;

/*
 * 이름         널?       유형           
---------- -------- ------------ 
REL_NO     NOT NULL VARCHAR2(20) 
REL_PRICE           NUMBER       
REL_DATE            VARCHAR2(50) 
REL_CNT             NUMBER       
REL_STATUS          NUMBER     
 * */
public class Relout {
	private String relNo;
	private int relPrice;
	private String relDate;
	private int relCnt;
	private int relStatus;
	
	public Relout() {
		// TODO Auto-generated constructor stub
	}

	public String getRelNo() {
		return relNo;
	}

	public void setRelNo(String relNo) {
		this.relNo = relNo;
	}

	public int getRelPrice() {
		return relPrice;
	}

	public void setRelPrice(int relPrice) {
		this.relPrice = relPrice;
	}

	public String getRelDate() {
		return relDate;
	}

	public void setRelDate(String relDate) {
		this.relDate = relDate;
	}

	public int getRelCnt() {
		return relCnt;
	}

	public void setRelCnt(int relCnt) {
		this.relCnt = relCnt;
	}

	public int getRelStatus() {
		return relStatus;
	}

	public void setRelStatus(int relStatus) {
		this.relStatus = relStatus;
	}
	
}

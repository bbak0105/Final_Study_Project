package com.itwill.dto;

/*
 * 이름          널?       유형            
----------- -------- ------------- 
RCP_NO      NOT NULL VARCHAR2(20)  
RCP_PDN_NO           VARCHAR2(20)  -> 이름 RCP_PDN_NO 에서 RCP_PO_NO 로 수정
RCP_DATE             VARCHAR2(50)  
RCP_CNT              NUMBER        
RCP_PRICE            NUMBER        
RCP_PRODUCT          VARCHAR2(50)  
RCP_MEMO             VARCHAR2(100) 
RCP_STATUS           NUMBER        
 * */

public class Receipt {
   private String rcpNo;
//   private String rcpPdnNo;
   private String rcpPoNo;
   private String rcpDate;
   private int rcpCnt;
   private int rcpPrice;
   private String rcpProduct;
   private String rcpMemo;
   private int rcpStatus;
   
   private Production pdn; //상품명
   
  public Receipt() {
	// TODO Auto-generated constructor stub
}

public String getRcpNo() {
	return rcpNo;
}

public void setRcpNo(String rcpNo) {
	this.rcpNo = rcpNo;
}

//public String getRcpPdnNo() {
//	return rcpPdnNo;
//}
//
//public void setRcpPdnNo(String rcpPdnNo) {
//	this.rcpPdnNo = rcpPdnNo;
//}

public String getRcpPoNo() {
	return rcpPoNo;
}

public void setRcpPoNo(String rcpPoNo) {
	this.rcpPoNo = rcpPoNo;
}

public String getRcpDate() {
	return rcpDate;
}

public void setRcpDate(String rcpDate) {
	this.rcpDate = rcpDate;
}

public int getRcpCnt() {
	return rcpCnt;
}

public void setRcpCnt(int rcpCnt) {
	this.rcpCnt = rcpCnt;
}

public int getRcpPrice() {
	return rcpPrice;
}

public void setRcpPrice(int rcpPrice) {
	this.rcpPrice = rcpPrice;
}

public String getRcpProduct() {
	return rcpProduct;
}

public void setRcpProduct(String rcpProduct) {
	this.rcpProduct = rcpProduct;
}

public String getRcpMemo() {
	return rcpMemo;
}

public void setRcpMemo(String rcpMemo) {
	this.rcpMemo = rcpMemo;
}

public int getRcpStatus() {
	return rcpStatus;
}

public void setRcpStatus(int rcpStatus) {
	this.rcpStatus = rcpStatus;
}

public Production getPdn() {
	return pdn;
}

public void setPdn(Production pdn) {
	this.pdn = pdn;
}

public Receipt(String rcpNo, String rcpPoNo, String rcpDate, int rcpCnt, int rcpPrice, String rcpProduct,
		String rcpMemo, int rcpStatus, Production pdn) {
	super();
	this.rcpNo = rcpNo;
//	this.rcpPdnNo = rcpPdnNo;
	this.rcpPoNo = rcpPoNo;
	this.rcpDate = rcpDate;
	this.rcpCnt = rcpCnt;
	this.rcpPrice = rcpPrice;
	this.rcpProduct = rcpProduct;
	this.rcpMemo = rcpMemo;
	this.rcpStatus = rcpStatus;
	this.pdn = pdn;
}
   
}
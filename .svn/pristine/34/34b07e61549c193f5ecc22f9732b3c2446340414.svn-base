package com.itwill.dto;

/*이름        널?       유형            
--------- -------- ------------- 
PD_NO     NOT NULL VARCHAR2(20)  
PD_PDN_NO          VARCHAR2(20)  
PD_PCG_NO          VARCHAR2(5)   
PD_CNT             NUMBER        
PD_PRICE           NUMBER   */

public class Product {
	private String pdNo;
	private String pdPdnNo;//생산 넘버(참조) -> 생산상품명 가져오기
	private String pdPcgNo;//카테고리 넘버(참조) -> 카테고리 이름 가져오기
	private int pdCnt;
	private int pdPrice;
	
	private ProductCategory pcg;//-> 카테고리 이름 가져오기
	
	private Production pdn;//-> 생산상품명 가져오기
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public ProductCategory getPcg() {
		return pcg;
	}

	public void setPcg(ProductCategory pcg) {
		this.pcg = pcg;
	}

	
	public Production getPdn() {
		return pdn;
	}


	public void setPdn(Production pdn) {
		this.pdn = pdn;
	}


	public String getPdNo() {
		return pdNo;
	}

	public void setPdNo(String pdNo) {
		this.pdNo = pdNo;
	}

	public String getPdPdnNo() {
		return pdPdnNo;
	}


	public void setPdPdnNo(String pdPdnNo) {
		this.pdPdnNo = pdPdnNo;
	}


	public String getPdPcgNo() {
		return pdPcgNo;
	}

	public void setPdPcgNo(String pdPcgNo) {
		this.pdPcgNo = pdPcgNo;
	}

	public int getPdCnt() {
		return pdCnt;
	}

	public void setPdCnt(int pdCnt) {
		this.pdCnt = pdCnt;
	}

	public int getPdPrice() {
		return pdPrice;
	}

	public void setPdPrice(int pdPrice) {
		this.pdPrice = pdPrice;
	}
}

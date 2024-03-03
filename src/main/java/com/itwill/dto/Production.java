package com.itwill.dto;

/*이름          널?       유형            
----------- -------- ------------- 
PDN_NO      NOT NULL VARCHAR2(20)  
PDN_PO_NO            VARCHAR2(20)  
PDN_CNT              NUMBER        
pdn_product          VARCHAR2(100) 
PDN_DATE             VARCHAR2(50)  
PDN_EMP_NO           VARCHAR2(20)  
PDN_STATUS           NUMBER*/  

public class Production {
	private String pdnNo;
	private String pdnPoNo;
	private int pdnCnt;
	private String pdnProduct;
	private String pdndate;
	private String pdnEmpNo;
	private int pdnStatus;
	private String pdnRelNo;
	
	public Production() {
		// TODO Auto-generated constructor stub
	}

	public String getPdnNo() {
		return pdnNo;
	}

	public void setPdnNo(String pdnNo) {
		this.pdnNo = pdnNo;
	}

	public String getPdnPoNo() {
		return pdnPoNo;
	}

	public void setPdnPoNo(String pdnPoNo) {
		this.pdnPoNo = pdnPoNo;
	}

	public int getPdnCnt() {
		return pdnCnt;
	}

	public void setPdnCnt(int pdnCnt) {
		this.pdnCnt = pdnCnt;
	}

	public String getPdnProduct() {
		return pdnProduct;
	}

	public void setPdnProduct(String pdnProduct) {
		this.pdnProduct = pdnProduct;
	}

	public String getPdndate() {
		return pdndate;
	}

	public void setPdndate(String pdndate) {
		this.pdndate = pdndate;
	}

	public String getPdnEmpNo() {
		return pdnEmpNo;
	}

	public void setPdnEmpNo(String pdnEmpNo) {
		this.pdnEmpNo = pdnEmpNo;
	}

	public int getPdnStatus() {
		return pdnStatus;
	}

	public void setPdnStatus(int pdnStatus) {
		this.pdnStatus = pdnStatus;
	}

	public String getPdnRelNo() {
		return pdnRelNo;
	}

	public void setPdnRelNo(String pdnRelNo) {
		this.pdnRelNo = pdnRelNo;
	}
	
	
}

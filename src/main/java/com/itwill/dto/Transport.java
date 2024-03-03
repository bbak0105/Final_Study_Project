package com.itwill.dto;

/*이름       널?       유형           
-------- -------- ------------ 
TP_NO    NOT NULL VARCHAR2(20) 
TP_PHONE          VARCHAR2(15) 
TP_NAME           VARCHAR2(50) 
*/
public class Transport {
	private String tpNo;
	private String tpPhone;
	private String tpName;
	
	public Transport() {
		// TODO Auto-generated constructor stub
	}

	public String getTpNo() {
		return tpNo;
	}

	public void setTpNo(String tpNo) {
		this.tpNo = tpNo;
	}

	public String getTpPhone() {
		return tpPhone;
	}

	public void setTpPhone(String tpPhone) {
		this.tpPhone = tpPhone;
	}

	public String getTpName() {
		return tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}
}

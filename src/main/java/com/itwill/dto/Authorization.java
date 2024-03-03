package com.itwill.dto;

import org.springframework.web.multipart.MultipartFile;

/*
 이름           널?       유형            
------------ -------- ------------- 
AUTH_NO      NOT NULL VARCHAR2(20)  
AUTH_EMP_NO  NOT NULL VARCHAR2(20)  
AUTH_CASE             VARCHAR2(50)  
AUTH_CONTENT          VARCHAR2(100) 
AUTH_WHILE            NUMBER        
AUTH_YN               CHAR(1)       
AUTH_REQDATE         DATE          
AUTH_DELETE           CHAR(1)       
AUTH_DELDATE           DATE          
AUTH_FILE             VARCHAR2(50)  
 */

public class Authorization {
	private String authNo;
	private String authEmpNo;
	private String authCase;
	private String authContent;
	private int authWhile;
	private String authYn;
	private String authReqdate;
	private String authDelete;
	private String authDeldate; 
	private String authFile;
	private String authSubject;
	private String authUpload;
	private String authSdate;
	private String authEdate;
	private String authAppdate;
	private String authSum;
	
	private Employee employee;
	private MultipartFile file;
	
	public Authorization() {
		// TODO Auto-generated constructor stub
	}

	public String getAuthNo() {
		return authNo;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getAuthEmpNo() {
		return authEmpNo;
	}

	public void setAuthEmpNo(String authEmpNo) {
		this.authEmpNo = authEmpNo;
	}

	public String getAuthCase() {
		return authCase;
	}

	public void setAuthCase(String authCase) {
		this.authCase = authCase;
	}

	public String getAuthContent() {
		return authContent;
	}

	public void setAuthContent(String authContent) {
		this.authContent = authContent;
	}
	
	public int getAuthWhile() {
		return authWhile;
	}

	public void setAuthWhile(int authWhile) {
		this.authWhile = authWhile;
	}

	public String getAuthYn() {
		return authYn;
	}

	public void setAuthYn(String authYn) {
		this.authYn = authYn;
	}

	public String getAuthReqdate() {
		return authReqdate;
	}

	public void setAuthReqdate(String authReqdate) {
		this.authReqdate = authReqdate;
	}

	public String getAuthDelete() {
		return authDelete;
	}

	public void setAuthDelete(String authDelete) {
		this.authDelete = authDelete;
	}

	public String getAuthDeldate() {
		return authDeldate;
	}

	public void setAuthDeldate(String authDeldate) {
		this.authDeldate = authDeldate;
	}

	public String getAuthFile() {
		return authFile;
	}

	public void setAuthFile(String authFile) {
		this.authFile = authFile;
	}

	public String getAuthSubject() {
		return authSubject;
	}

	public void setAuthSubject(String authSubject) {
		this.authSubject = authSubject;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getAuthUpload() {
		return authUpload;
	}

	public void setAuthUpload(String authUpload) {
		this.authUpload = authUpload;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getAuthSdate() {
		return authSdate;
	}

	public void setAuthSdate(String authSdate) {
		this.authSdate = authSdate;
	}

	public String getAuthEdate() {
		return authEdate;
	}

	public void setAuthEdate(String authEdate) {
		this.authEdate = authEdate;
	}

	public String getAuthAppdate() {
		return authAppdate;
	}

	public void setAuthAppdate(String authAppdate) {
		this.authAppdate = authAppdate;
	}

	public String getAuthSum() {
		return authSum;
	}

	public void setAuthSum(String authSum) {
		this.authSum = authSum;
	}
	
	
	
	
	
	
}

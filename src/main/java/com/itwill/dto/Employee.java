package com.itwill.dto;

import org.springframework.web.multipart.MultipartFile;

/*
이름          널?       유형            
----------- -------- ------------- 
EMP_NO      NOT NULL VARCHAR2(20)  
EMP_NAME             VARCHAR2(50)  
EMP_REGINO           VARCHAR2(100) 
EMP_EMAIL            VARCHAR2(100) 
EMP_PHONE            VARCHAR2(50)  
EMP_ADDR             VARCHAR2(50)  
EMP_BIRTH            VARCHAR2(50)  
EMP_SDATE            VARCHAR2(50)  
EMP_EDATE            VARCHAR2(50)  
EMP_ACCOUNT          VARCHAR2(100) 
EMP_DEPART           VARCHAR2(20)  
EMP_GRADE            CHAR(1)       
EMP_PHOTO            VARCHAR2(20)  
EMP_END              CHAR(1)       
EMP_SCHOOL           VARCHAR2(100) 
EMP_MAJOR            VARCHAR2(100) 
EMP_PASSWD  NOT NULL VARCHAR2(20)  
EMP_UPLOAD           VARCHAR2(20)  
   
 */

public class Employee {
	private String empNo;
	private String empName;
	private String empRegino;
	private String empEmail;
	private String empBirth;
	private String empPhone;
	private String empAddr;
	private String empSdate;
	private String empEdate;
	private String empAccount;
	private String empDepart;
	private String empGrade;
	private String empPhoto;
	private String empEnd;
	private String empSchool;
	private String empMajor;
	private String empPasswd;
	private String empUpload;
	
	private MultipartFile file;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}		

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRegino() {
		return empRegino;
	}

	public void setEmpRegino(String empRegino) {
		this.empRegino = empRegino;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpBirth() {
		return empBirth;
	}

	public void setEmpBirth(String empBirth) {
		this.empBirth = empBirth;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpSdate() {
		return empSdate;
	}

	public void setEmpSdate(String empSdate) {
		this.empSdate = empSdate;
	}

	public String getEmpEdate() {
		return empEdate;
	}

	public void setEmpEdate(String empEdate) {
		this.empEdate = empEdate;
	}

	public String getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public String getEmpGrade() {
		return empGrade;
	}

	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}

	public String getEmpPhoto() {
		return empPhoto;
	}

	public void setEmpPhoto(String empPhoto) {
		this.empPhoto = empPhoto;
	}

	public String getEmpEnd() {
		return empEnd;
	}

	public void setEmpEnd(String empEnd) {
		this.empEnd = empEnd;
	}
	
	public String getEmpSchool() {
		return empSchool;
	}

	public void setEmpSchool(String empSchool) {
		this.empSchool = empSchool;
	}
	
	public String getEmpMajor() {
		return empMajor;
	}

	public void setEmpMajor(String empMajor) {
		this.empMajor = empMajor;
	}

	public String getEmpPasswd() {
		return empPasswd;
	}

	public void setEmpPasswd(String empPasswd) {
		this.empPasswd = empPasswd;
	}

	public String getEmpUpload() {
		return empUpload;
	}

	public void setEmpUpload(String empUpload) {
		this.empUpload = empUpload;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	
	
	
}

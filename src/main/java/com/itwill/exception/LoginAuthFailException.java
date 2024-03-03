package com.itwill.exception;

public class LoginAuthFailException extends Exception {
	   private static final long serialVersionUID = 1L;

	   private String empNo;
	   
	   public LoginAuthFailException() {
	      // TODO Auto-generated constructor stub
	   }

	   public LoginAuthFailException(String empNo, String message) {
	      super(message);
	      this.empNo = empNo;
	   }

	   public String getEmpNo() {
			return empNo;
		}
	
	   public void setEmpNo(String empNo) {
			this.empNo = empNo;
		}

	   
	}
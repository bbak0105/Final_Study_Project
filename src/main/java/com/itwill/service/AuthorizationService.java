package com.itwill.service;

import java.util.List;

import com.itwill.dto.Authorization;

public interface AuthorizationService {
	void insertAuthorization(Authorization authorization);
	void approvalAuthorization(Authorization authorization);
	void deleteAuthorization(Authorization authorization);
	Authorization selectAthorNo(String authNo);
	Authorization selectAuthWhile(String empNo);
	List<Authorization> getAuthList();
	List<Authorization> getApprList();
	
	//µ¿ÀûÄõ¸®
	List<Authorization> getDynamicAuthList(Authorization authorization);
	List<Authorization> getDynamicApprList(Authorization authorization);
	
	
	
}

package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.dao.AuthorizationDAO;
import com.itwill.dto.Authorization;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

	@Autowired
	private AuthorizationDAO authorizationDAO;
	
	@Transactional
	@Override
	public void insertAuthorization(Authorization authorization) {
		authorizationDAO.insertAuthorization(authorization);		
	}
	
	@Override
	public void approvalAuthorization(Authorization authorization) {
		authorizationDAO.approvalAuthorization(authorization);
		
	}
	
	@Override
	public void deleteAuthorization(Authorization authorization) {
		authorizationDAO.deleteAuthorization(authorization);		
	}
	
	@Override
	public Authorization selectAthorNo(String authNo) {
		return authorizationDAO.selectAthorNo(authNo);
	}
	
	@Override
	public List<Authorization> getAuthList() {
		return authorizationDAO.selectAthorList();
	}
	
	@Override
	public List<Authorization> getApprList() {
		return authorizationDAO.selectApprList();
	}

	@Override
	public List<Authorization> getDynamicAuthList(Authorization authorization) {
		// TODO Auto-generated method stub
		return authorizationDAO.selectDynamicAthorList(authorization);
	}

	@Override
	public List<Authorization> getDynamicApprList(Authorization authorization) {
		// TODO Auto-generated method stub
		return authorizationDAO.selectDynamicApprList(authorization);
	}
	
	@Override
	public Authorization selectAuthWhile(String empNo) {
		return authorizationDAO.selectAuthWhile(empNo);
	}
}

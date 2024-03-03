package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.ApprovalDAO;
import com.itwill.dao.AuthorizationDAO;
import com.itwill.dto.Approval;
import com.itwill.dto.Authorization;

@Service
public class ApprovalServiceImpl implements ApprovalService {

	@Autowired
	private ApprovalDAO approvalDAO;
	
	@Override
	public void insertApproval(Approval approval) {
		approvalDAO.insertApproval(approval);	
	}
	

}

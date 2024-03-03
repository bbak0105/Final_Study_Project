package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.AttitudeDAO;
import com.itwill.dto.Attitude;

@Service
public class AttitudeServiceImpl implements AttitudeService{

	@Autowired
	private AttitudeDAO attitudeDAO;

	@Override
	public void insertAttitude(Attitude attitude) {
		// TODO Auto-generated method stub
		attitudeDAO.insertAttitude(attitude);
		
	}
	
	@Override
	public void insertVacation(Attitude attitude) {
		attitudeDAO.insetVacation(attitude);		
	}

	@Override
	public void updateAttitude(Attitude attitude) {
		// TODO Auto-generated method stub
		attitudeDAO.updateAttitude(attitude);		
	}
	
	@Override
	public Attitude selectAttdNo(String empNo) {
		return attitudeDAO.selectAttdNo(empNo);
	}
	
	@Override
	public List<Attitude> getAttdList() {
		return attitudeDAO.selectAttdList();
	}

	@Override
	public List<Attitude> getDaynamicAttdList(Attitude attitude) {
		// TODO Auto-generated method stub
		return attitudeDAO.selectDynamicAttdList(attitude);
	}
	
	
	
	
}

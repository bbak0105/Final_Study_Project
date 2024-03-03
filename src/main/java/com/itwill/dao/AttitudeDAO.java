
package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Attitude;

public interface AttitudeDAO {
	int insertAttitude(Attitude attitude);
	int insetVacation(Attitude attitude);
	int updateAttitude(Attitude attitude);
	List<Attitude> selectAttdList();
	Attitude selectAttdNo(String empNo);
	//µ¿ÀûÄõ¸®
	List<Attitude> selectDynamicAttdList(Attitude attitude);

}

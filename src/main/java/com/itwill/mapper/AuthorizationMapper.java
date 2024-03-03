package com.itwill.mapper;


import java.util.List;

import com.itwill.dto.Authorization;

public interface AuthorizationMapper {
	int insertAuthorization(Authorization authorization);
	int approvalAuthorization(Authorization authorization);
	int deleteAuthorization(Authorization authorization);
	Authorization selectAthorNo(String authNo);
	Authorization selectAuthWhile(String empNo);
	List<Authorization> selectApprList();
	List<Authorization> selectAthorList();
	//µ¿Àû Äõ¸®
	List<Authorization> selectDynamicAthorList(Authorization authorization);
	List<Authorization> selectDynamicApprList(Authorization authorization);
	
}





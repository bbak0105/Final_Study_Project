package com.itwill.mapper;

import java.util.List;

import com.itwill.dto.Placeorder;
import com.itwill.dto.Receipt;

public interface ReceiptMapper {
	
	int insertRcp(Receipt receipt);
	Receipt selectCearchRcp(String rcpNo);
	List<Receipt> selectRcpList();
	List<Placeorder> selectPoList();
}

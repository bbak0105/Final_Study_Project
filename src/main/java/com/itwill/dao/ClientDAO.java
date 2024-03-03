package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Client;

public interface ClientDAO {
	
	List<Client> selectClientList();
	int insertClient(Client client);
	Client selectClient(Client client);
	Client selectClientNo(String cltNo);
	int updateClient(Client client);
}

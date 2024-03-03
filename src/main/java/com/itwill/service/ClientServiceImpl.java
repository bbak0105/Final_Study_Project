package com.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.dao.ClientDAO;
import com.itwill.dto.Client;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDAO clientDAO;
	
	
	@Override
	public List<Client> getClientList() {
		return clientDAO.selectClientList();
	}

	@Override
	public void addClient(Client client) {
		clientDAO.insertClient(client);
	}

	@Override
	public Client getClient(Client client) {
		return clientDAO.selectClient(client);
	}

	@Override
	public Client getClientNo(String cltNo) {
		return clientDAO.selectClientNo(cltNo);
	}

	@Override
	public void modifyClient(Client client) {
		clientDAO.updateClient(client);
	}
}

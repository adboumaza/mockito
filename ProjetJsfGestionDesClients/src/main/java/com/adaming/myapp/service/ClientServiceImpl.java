package com.adaming.myapp.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.IClientDao;
import com.adaming.myapp.entities.Client;
@Transactional
public class ClientServiceImpl implements IClientService {
    
	private IClientDao dao;
	
	private final Logger LOGGER = Logger.getLogger(ClientServiceImpl.class);

	public void setDao(IClientDao dao) {
		this.dao = dao;
		LOGGER.info("<-------dao Client injected------->");
	}

	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return dao.addClient(c);
	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		return dao.updateClient(c);
	}

	@Override
	public Client getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public Client delete(Long id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}

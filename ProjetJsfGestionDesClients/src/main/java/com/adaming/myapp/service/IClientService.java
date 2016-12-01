package com.adaming.myapp.service;

import java.util.List;

import com.adaming.myapp.entities.Client;

public interface IClientService {

Client addClient(final Client c);
	
	Client updateClient(final Client c);
	
	Client getOne(final Long id);
	
	Client delete(final Long id);
	
	List<Client> getAll();
}

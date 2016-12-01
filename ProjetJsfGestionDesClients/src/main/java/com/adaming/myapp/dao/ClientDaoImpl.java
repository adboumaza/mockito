package com.adaming.myapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.logging.Logger;

import com.adaming.myapp.entities.Client;

public class ClientDaoImpl implements IClientDao {
    
	@PersistenceContext
	private EntityManager em;
	
	private final Logger LOGGER = Logger.getLogger(ClientDaoImpl.class);
	
	@Override
	public Client addClient(Client c) {
		em.persist(c);
		LOGGER.info(c + "has been created");
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		em.merge(c);
		LOGGER.info(c + "has been edited");
		return c;
	}

	@Override
	public Client getOne(Long id) {
		Client c = em.find(Client.class,id);
		return c;
	}

	@Override
	public Client delete(Long id) {
		Client c = getOne(id);
		em.remove(c);
		return c;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Client> getAll() {
		Query query = em.createQuery("from Client c");
		return query.getResultList();
	}

}

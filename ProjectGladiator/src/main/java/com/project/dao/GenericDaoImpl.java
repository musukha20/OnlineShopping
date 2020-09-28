package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


public class GenericDaoImpl implements GenericDao{

	@PersistenceContext
	protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public <T> T save(Object obj) {
		return (T) entityManager.merge(obj);
	}

	@Transactional
	public <T> T fetchById(Class<T> clazz, Object id) {
		
		return (T) entityManager.find(clazz,id);
	}

}

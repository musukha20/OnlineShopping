package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Customer;
import com.project.entity.Retailer;

@Component
public class CustomerAddressDao extends GenericDaoImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Customer customer) {
		entityManager.persist(customer);
	}
	
}

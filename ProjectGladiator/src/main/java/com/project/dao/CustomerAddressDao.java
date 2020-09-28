package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Retailer;

@RestController
public class CustomerAddressDao  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
}

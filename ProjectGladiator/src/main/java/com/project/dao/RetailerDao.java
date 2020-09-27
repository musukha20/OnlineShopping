package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Retailer;
import com.project.exception.RetailerException;

public class RetailerDao extends GenericDaoImpl{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	 public List<Retailer> fetchRetailer(int rId){
	 if(rId != 0)
		return  entityManager.createQuery("select r from Retailer r where r.retailerId : =rId").setParameter("rId", rId).getResultList();
	 else
		 throw new RetailerException("Retailer not found");
	 }
		
}




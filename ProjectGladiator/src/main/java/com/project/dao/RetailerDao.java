package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.project.entity.Retailer;
import com.project.exception.RetailerException;

@Component("retailerdao1")
public class RetailerDao extends GenericDaoImpl{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	//@Transactional
	// public List<Retailer> fetchRetailer(int rId){
		//Query q = entityManager.createQuery("select r from Retailer r where r.retailerId : =rId");
		//q.setParameter("rId", rId);
		//List<Retailer> list = q.getResultList();
		//return list;
	// }
	
	@Transactional
	public void addNewRetailer(Retailer retailer)
	{
		entityManager.persist(retailer);
	}
}




package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.RetailerDao;
import com.project.entity.Retailer;
import com.project.exception.RetailerException;

@Component("retailerservice")
public class RetailerService {
	
	@Autowired
	private RetailerDao retailerDao;
	
	@Transactional
	public void add(Retailer r) {
		if(r.getName()=="Abheek") {
			retailerDao.save(r);
		}
		else
			throw new RetailerException("Cannot Add this Retailer");
	}
}

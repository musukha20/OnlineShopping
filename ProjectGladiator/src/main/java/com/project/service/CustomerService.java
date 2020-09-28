package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.CustomerAddressDao;
import com.project.entity.Customer;
import com.project.exception.RetailerException;

@Component("cs")
public class CustomerService {

	@Autowired
	private CustomerAddressDao customerAddressDao;
	
	@Transactional
	public void add(Customer c) {
		if(c.getName()=="Abheek") {
			customerAddressDao.save(c);
		}
		else
			throw new RetailerException("Cannot Add this Retailer");
	}
}

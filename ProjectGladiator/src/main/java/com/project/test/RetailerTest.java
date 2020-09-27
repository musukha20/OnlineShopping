package com.project.test;

import org.junit.Test;
import org.springframework.stereotype.Component;

import com.project.dao.GenericDao;
import com.project.dao.GenericDaoImpl;
import com.project.dao.RetailerDao;
import com.project.entity.Retailer;

public class RetailerTest { //testing only
	
	@Test
	public void add()
	{
		RetailerDao re = new RetailerDao();
		Retailer r = new Retailer();
		r.setAddress("D-72 Ground Floor");
		r.setName("Abheek");
		r.setEmail("abh@gmail.com");
		r.setPassword("abheek");
		re.save(r);
	}
	
	@Test
	public void fetch()
	{
		Retailer r = new Retailer();
	}

}

package com.project.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.project.dao.GenericDaoImpl;
import com.project.dao.RetailerDao;
import com.project.entity.Retailer;
import com.project.service.RetailerService;

public class RetailerTest { //testing only
	
	@Test
	public void checkadd()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//RetailerDao re = new RetailerDao();
		Retailer r = new Retailer();
		r.setAddress("D-72 Ground Floor");
		r.setName("Abheek");
		r.setEmail("abh@gmail.com");
		r.setPassword("abheek");
		RetailerService rserv = (RetailerService) ctx.getBean("retailerservice");
		rserv.add(r);
	}
}

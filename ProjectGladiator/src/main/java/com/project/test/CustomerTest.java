package com.project.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.entity.Customer;
import com.project.service.CustomerService;

public class CustomerTest {
	
	
	@Test
	public void add()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//RetailerDao re = new RetailerDao();
		Customer c = new Customer();
		c.setPhoneNo(14551);
		c.setCreditCard(123456);
		c.setDateOfBirth(LocalDate.of(1998, 04, 28));
		c.setEmail("abk@gmail.com");
		c.setPassword("elephant");
		c.setName("Abheek");
		CustomerService rserv = (CustomerService) ctx.getBean("cs");
		rserv.add(c);
	}

}

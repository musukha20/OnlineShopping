package com.project.Controller;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.RegistrationStatus;
import com.project.entity.Customer;
import com.project.service.CustomerService;

@RestController
public class CustomerTest {
	
	@Autowired
	private CustomerService customerService;
	
	
		@RequestMapping(path = "/register.lti", method = RequestMethod.POST)
		public RegistrationStatus register(@RequestBody Customer customer){
			customerService.register(customer);
			RegistrationStatus status = new RegistrationStatus();
			status.setStatusCode(100);
			status.setStatusMessage("Registration Succesful");
			status.setRegistered(true);
			return status;
			
		} 
}



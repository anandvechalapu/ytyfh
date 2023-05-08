package com.sacral.BBP-14.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.BBP-14.model.Customer;
import com.sacral.BBP-14.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/eligible")
	public List<Customer> getEligibleCustomers(){
		return customerService.findEligibleCustomers();
	}
	
	@GetMapping("/ineligible")
	public List<Customer> getIneligibleCustomers(){
		return customerService.findIneligibleCustomers();
	}
	
	@GetMapping("/confirmed")
	public List<Customer> getConfirmedCustomers(){
		return customerService.findConfirmedCustomers();
	}
	
	@GetMapping("/unconfirmed")
	public List<Customer> getUnconfirmedCustomers(){
		return customerService.findUnconfirmedCustomers();
	}
	
	@GetMapping("/paid")
	public List<Customer> getPaidCustomers(){
		return customerService.findPaidCustomers();
	}
	
	@GetMapping("/unpaid")
	public List<Customer> getUnpaidCustomers(){
		return customerService.findUnpaidCustomers();
	}
	
	@GetMapping("/secure")
	public List<Customer> getSecureCustomers(){
		return customerService.findSecureCustomers();
	}
	
	@GetMapping("/unsecure")
	public List<Customer> getUnsecureCustomers(){
		return customerService.findUnsecureCustomers();
	}

}
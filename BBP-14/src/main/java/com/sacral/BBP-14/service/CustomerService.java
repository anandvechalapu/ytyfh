package com.sacral.BBP-14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.BBP-14.model.Customer;
import com.sacral.BBP-14.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findEligibleCustomers(){
		return customerRepository.findEligibleCustomers();
	}
	
	public List<Customer> findIneligibleCustomers(){
		return customerRepository.findIneligibleCustomers();
	}
	
	public List<Customer> findConfirmedCustomers(){
		return customerRepository.findConfirmedCustomers();
	}
	
	public List<Customer> findUnconfirmedCustomers(){
		return customerRepository.findUnconfirmedCustomers();
	}
	
	public List<Customer> findPaidCustomers(){
		return customerRepository.findPaidCustomers();
	}
	
	public List<Customer> findUnpaidCustomers(){
		return customerRepository.findUnpaidCustomers();
	}
	
	public List<Customer> findSecureCustomers(){
		return customerRepository.findSecureCustomers();
	}
	
	public List<Customer> findUnsecureCustomers(){
		return customerRepository.findUnsecureCustomers();
	}

}
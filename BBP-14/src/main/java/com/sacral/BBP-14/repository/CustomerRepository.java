package com.sacral.BBP-14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.BBP-14.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query("SELECT c FROM Customer c WHERE c.isEligible = true")
	public List<Customer> findEligibleCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.isEligible = false")
	public List<Customer> findIneligibleCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasConfirmedTransmission = true")
	public List<Customer> findConfirmedCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasConfirmedTransmission = false")
	public List<Customer> findUnconfirmedCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasPaidPremium = true")
	public List<Customer> findPaidCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasPaidPremium = false")
	public List<Customer> findUnpaidCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasSecureAPI = true")
	public List<Customer> findSecureCustomers();
	
	@Query("SELECT c FROM Customer c WHERE c.hasSecureAPI = false")
	public List<Customer> findUnsecureCustomers();
	
}
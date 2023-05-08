package com.sacral.BBP-14.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private boolean isEligible;
	private boolean hasConfirmedTransmission;
	private boolean hasPaidPremium;
	private boolean hasSecureAPI;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEligible() {
		return isEligible;
	}
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
	public boolean isHasConfirmedTransmission() {
		return hasConfirmedTransmission;
	}
	public void setHasConfirmedTransmission(boolean hasConfirmedTransmission) {
		this.hasConfirmedTransmission = hasConfirmedTransmission;
	}
	public boolean isHasPaidPremium() {
		return hasPaidPremium;
	}
	public void setHasPaidPremium(boolean hasPaidPremium) {
		this.hasPaidPremium = hasPaidPremium;
	}
	public boolean isHasSecureAPI() {
		return hasSecureAPI;
	}
	public void setHasSecureAPI(boolean hasSecureAPI) {
		this.hasSecureAPI = hasSecureAPI;
	}
	
	

}
package com.sacral.BBP-14.service;

import com.sacral.BBP-14.entity.Customer;
import com.sacral.BBP-14.repository.PermutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermutationService {

    @Autowired
    private PermutationRepository permutationRepository;

    public List<Customer> findByRulesProvidedByBALIC(String rulesProvidedByBALIC) {
        return permutationRepository.findByRulesProvidedByBALIC(rulesProvidedByBALIC);
    }

    public List<Customer> findByReportsBasedOnAppliedRules(String reportsBasedOnAppliedRules) {
        return permutationRepository.findByReportsBasedOnAppliedRules(reportsBasedOnAppliedRules);
    }

    public List<Customer> findByLargeVolumeOfCustomerData(String largeVolumeOfCustomerData) {
        return permutationRepository.findByLargeVolumeOfCustomerData(largeVolumeOfCustomerData);
    }

    public List<Customer> findByAccurateTransmission(String accurateTransmission) {
        return permutationRepository.findByAccurateTransmission(accurateTransmission);
    }

    public List<Customer> findBySecureDirectDebitAPIExposedByBandhanBank(String secureDirectDebitAPIExposedByBandhanBank) {
        return permutationRepository.findBySecureDirectDebitAPIExposedByBandhanBank(secureDirectDebitAPIExposedByBandhanBank);
    }

    public List<Customer> findByClearConfirmationOfSuccessfulTransmission(String clearConfirmationOfSuccessfulTransmission) {
        return permutationRepository.findByClearConfirmationOfSuccessfulTransmission(clearConfirmationOfSuccessfulTransmission);
    }
}